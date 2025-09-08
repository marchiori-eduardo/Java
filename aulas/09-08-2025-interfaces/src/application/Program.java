package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter data of Rental");
        System.out.print("Model car: ");
        String carModel = sc.nextLine();
        System.out.println("Out (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.println("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel) );

        System.out.println("Enter the price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Enter the price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("INVOICE:");
        System.out.println("Basic payment: " + cr.getInvoice().getBasicPayment());
        System.out.println("Tax: " + cr.getInvoice().getTax());
        System.out.println("Total Payment: " + cr.getInvoice().getTotalPayment());


        sc.close();
    }
}
