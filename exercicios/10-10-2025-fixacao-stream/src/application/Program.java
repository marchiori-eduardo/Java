package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
//C:\Users\Eduardo\Desktop\java\java-basico\exercicios\10-09-2025-ex-stream\in.csv

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();

            }

            System.out.print("Enter salary: ");
            Double salaryy = sc.nextDouble();

//            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());


            List<String> emails = list.stream().filter(p -> p.getSalary() > salaryy).map(p -> p.getEmail()).sorted().collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + String.format("%.2f:", salaryy));
            emails.forEach(System.out::println);

            double sum = list.stream().filter(p -> p.getName().charAt(0) == 'M').map(p -> p.getSalary()).reduce(0.0, (x, y) -> x + y);

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));


        } catch (IOException e) {
            System.out.println("Error in reading file: "+ e.getMessage());
        }

        sc.close();
    }
}
