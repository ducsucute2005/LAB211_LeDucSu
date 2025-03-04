/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7_ex1_view;

import Week7_ex1_controller.FruitShopController;
import Week7_ex1_model.Fruit;
import Week7_ex1_model.Order;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Menu {

    private FruitShopController controller = new FruitShopController();

    Scanner sc = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            System.out.println("\nFRUIT SHOP SYSTEM");
            System.out.println("1. Create Fruit");
            System.out.println("2. View orders");
            System.out.println("3. Shopping");
            System.out.println("4. Exit");
            System.out.print("Please choose: ");
            int choice;
            while (true) {
                try {

                    choice = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("invalid num, try again");
                }
            }
            switch (choice) {
                case 1:
                    createFruit();
                    break;
                case 2:
                    viewOrders();
                    break;
                case 3:
                    shopping();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public void createFruit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fruit ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Fruit Name: ");
        String name = sc.nextLine();

        double price;
        while (true) {
            try {
                System.out.print("Enter Price: ");
                price = Double.parseDouble(sc.nextLine());
                if (price <= 0) {
                    System.out.println("Price must be greater than 0.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price, try again.");
            }
        }

        int quantity;
        while (true) {
            try {
                System.out.print("Enter Quantity: ");
                quantity = Integer.parseInt(sc.nextLine());
                if (quantity < 0) {
                    System.out.println("Quantity cannot be negative.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid quantity, try again.");
            }
        }
        System.out.print("Enter Origin: ");
        String origin = sc.nextLine();
        Fruit fruit = new Fruit(id, name, price, quantity, origin);
        controller.addFruit(id, name, price, quantity, origin);
    }

    public void viewOrders() {
        List<Order> orders = controller.getOrders();
        if (orders.isEmpty()) {
            System.out.println("No orders available.");
            return;
        }
        for (Order order : orders) {
            order.displayOrder();
        }
    }

    public void shopping() {
        List<Fruit> fruits = controller.getFruits();
        if (fruits.isEmpty()) {
            System.out.println("No fruits available.");
            return;
        }

        List<String> selectedFruitIds = new ArrayList<>();
        List<Integer> selectedQuantities = new ArrayList<>();

        while (true) {
            System.out.println("List of Fruits:");
            for (int i = 0; i < fruits.size(); i++) {
                Fruit f = fruits.get(i);
                System.out.printf("%d. %s | %s | %s | %.2f$\n", i + 1, f.getName(), f.getQuantity(), f.getOrigin(), f.getPrice());
            }

            System.out.print("Select an item: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice < 1 || choice > fruits.size()) {
                    System.out.println("Invalid choice. Try again.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again.");
                continue;
            }

            Fruit selectedFruit = fruits.get(choice - 1);
            System.out.println("You selected: " + selectedFruit.getName());

            System.out.print("Enter quantity: ");
            int quantity;
            try {
                quantity = Integer.parseInt(sc.nextLine());
                if (quantity <= 0) {
                    System.out.println("Quantity must be greater than 0.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Try again.");
                continue;
            }

            if (!controller.updateFruitStock(selectedFruit.getId(), quantity)) {
                System.out.println("Not enough stock!");
                break;
            }

            selectedFruitIds.add(selectedFruit.getId());
            selectedQuantities.add(quantity);

            System.out.print("Do you want to continue shopping (Y/N)? ");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.print("Enter your name: ");
        String customerName = sc.nextLine();
        controller.addOrder(customerName, selectedFruitIds, selectedQuantities);

        System.out.println("Order placed successfully!");
    }
}
