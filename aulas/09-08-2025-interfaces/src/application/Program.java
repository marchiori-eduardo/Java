package application;

import model.entities.CarRental;
import model.entities.Vehicle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println("Enter data of Rental");
        System.out.println("Model car: ");
        String carModel = sc.nextLine();
        System.out.println("Out (dd/MM/yyyy hh:mm): ");
        Date start = sdf.parse(sc.next());
        System.out.println("Return (dd/MM/yyyy hh:mm): ");
        Date finish = sdf.parse(sc.next());

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel) );



        sc.close();
    }
}
