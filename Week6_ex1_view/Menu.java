/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6_ex1_view;

import Week6_ex1_controller.WorkManagement;
import Week6_ex1_model.Worker;
import java.util.*;

public class Menu {

    Scanner sc = new Scanner(System.in);
    WorkManagement workmana = new WorkManagement();

    public void start() {

        while (true) {
            System.out.println("======== Worker Management =========");
            System.out.println("1. Add Worker");
            System.out.println("2. Up salary");
            System.out.println("3. Down salary");
            System.out.println("4. Display Information salary");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addWorker();
                    break;
                case 2:
                    changeSalary("up");
                    break;
                case 3:
                    changeSalary("down");
                    break;
                case 4:
                    workmana.getInformationSalary();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public void addWorker() {
        System.out.print("Enter id: ");
        String id = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        int age = 0;
        while (true) {
            try {
                System.out.print("Enter Age: ");
                age = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("invalid num, try again");
            }
        }
        double salary = 0.0;
        while (true) {
            try {
                System.out.print("Enter Salary: ");
                salary = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("invalid salary, try again");
            }
        }

        System.out.print("Enter work location: ");
        String location = sc.nextLine();

        workmana.addWorker(id, name, age, salary, location);
    }

    public void changeSalary(String status) {
        System.out.print("Enter id: ");
        String id = sc.nextLine();
        double amount = 0.0;
        while (true) {
            try {
                System.out.print("Enter Salary increase amount: ");
                amount = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("invalid amount, try again");
            }

        }
        workmana.changeSalary("UP", id, amount);
    }
}
