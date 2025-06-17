package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered: ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already taken! Try again: ");
            }


            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);

            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

//        Integer pos = position(list, idSalary);
        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

//        if (pos == null) {
        if (emp == null) {
            System.out.println("Employee with id " + idSalary + " not found");
        } else {
            System.out.print("Enter the porcentage: ");
            double percent = sc.nextDouble();

            emp.increaseSalary(percent);


        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, Integer id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

//    public static Integer position(List<Employee> list, int id) {
//        for (int i = 0; i <= list.size(); i++) {
//            if (list.get(i).getId() == id) {
//                return i;
//            }
//        }
//        return null;
//    }
}
