package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)  {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the data of contract: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date: ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);;
        System.out.print("Enter value of contract: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("enter the number of installments: ");
        int numberInstalments = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, numberInstalments);

        System.out.println("Installments: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }



        sc.close();
    }

}