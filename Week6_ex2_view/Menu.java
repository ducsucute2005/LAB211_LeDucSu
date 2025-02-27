/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6_ex2_view;

/**
 *
 * @author selu3
 */
import Week6_ex2_controller.ContactManagement;
import java.util.*;

public class Menu {

    Scanner sc = new Scanner(System.in);
    ContactManagement contactmana = new ContactManagement();

    public void start() {

        while (true) {
            System.out.println("======== Contact Management =========");
            System.out.println("1. Add Contact");
            System.out.println("2. Display all contact");
            System.out.println("3. Delete a contact");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    contactmana.display();
                    break;
                case 3:
                    delelteAContact();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public void addContact() {
        boolean check = false;
        System.out.println("Enter full name: ");
        String fullName = sc.nextLine();
        System.out.println("Enter group: ");
        String group = sc.nextLine();
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNum = sc.nextLine();

        contactmana.phoneFormat(phoneNum);

        contactmana.addContact(fullName, group, address, phoneNum);
        System.out.println("add contact complete");
    }

    public void delelteAContact() {
        int id = 0;
        while (true) {
            try {
                System.out.println("Enter id to delete: ");
                id = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("invalid id, try again");
            }
        }

        contactmana.deleteAContact(id);
    }

}
