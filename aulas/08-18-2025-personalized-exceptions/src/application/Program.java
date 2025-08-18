package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkIn = LocalDate.parse(sc.next(), dtf);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(sc.next(), dtf);

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation:" + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.next(), dtf);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.next(), dtf);


            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation:" + reservation);
        }
        catch (DateTimeException e) {
            System.out.println("Invalid date entered. Please try again.");
        }
        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error occurred. Please try again.");
        }

        sc.close();
    }
}
