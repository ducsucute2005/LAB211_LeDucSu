/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7_ex3_view;

/**
 *
 * @author selu3
 */
import Week7_ex3_controller.ManageEastAsiaCountries;
import Week7_ex3_model.EastAsiaCountries;
import java.util.*;

public class Menu {

    Scanner sc = new Scanner(System.in);
    ManageEastAsiaCountries manager = new ManageEastAsiaCountries();

    public void start() {

        while (true) {
            System.out.println("MENU");
            System.out.println("1. Input the information of 11 countries in East Asia.");
            System.out.println("2. Display the information of countries you’ve just input.");
            System.out.println("3. Search the information of country by user-entered name.");
            System.out.println("4. Display the information of countries sorted name in ascending order.");
            System.out.println("5. Exit.");
            System.out.print("Your choice: ");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("invalid choice, try again");
                }
            }
            switch (choice) {
                case 1:
                    inputCountryInformation();
                    break;
                case 2:
                    manager.getRecentlyEnteredInformation();
                    break;
                case 3:
                    searchCountry();
                    break;
                case 4:
                    manager.sortCountry();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    public void inputCountryInformation() {
        System.out.print("Enter code of country: ");
        String code = sc.nextLine();
        System.out.print("Enter name of country: ");
        String name = sc.nextLine();
        float area;
        while (true) {
            try {
                System.out.print("Enter total area: ");
                area = Float.parseFloat(sc.nextLine());
                if (area <= 0) {
                    throw new IllegalArgumentException("Total area must be greater than 0.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Enter terrain of country: ");
        String terrain = sc.nextLine();

        manager.addCountryInformation(code, name, area, terrain);
        System.out.println("Country added successfully.");
    }

    public void searchCountry() {
        System.out.print("Enter the name you want to search for: ");
        String name = sc.nextLine();
        manager.searchCountry(name);
    }
}
