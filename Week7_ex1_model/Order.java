/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7_ex1_model;

/**
 *
 * @author selu3
 */
import Week7_ex1_controller.FruitShopController;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private String customerName;
    private List<Fruit> fruitList;
    private List<Integer> quantities;
    private FruitShopController controller;

    public Order() {
    }

    public Order(String customerName, FruitShopController controller) {
        this.customerName = customerName;
        this.fruitList = new ArrayList<>();
        this.quantities = new ArrayList<>();
        this.controller = controller;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Fruit> getFruits() {
        return fruitList;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setFruitList(List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    public void setQuantities(List<Integer> quantities) {
        this.quantities = quantities;
    }

    public FruitShopController getController() {
        return controller;
    }

    public void setController(FruitShopController controller) {
        this.controller = controller;
    }

    public void addItem(String fruitId, int quantity) {
        
        if (controller == null) {
            System.out.println("Error: Controller is not initialized.");
            return;
        }
        Fruit fruit = controller.findFruitById(fruitId);
        if (fruit != null) {
            fruitList.add(fruit);
            quantities.add(quantity);
        } else {
            System.out.println("Fruit not found.");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < fruitList.size(); i++) {
            total += fruitList.get(i).getPrice() * quantities.get(i);
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("Customer: " + customerName);
        System.out.println("Product | Quantity | Price | Amount");
        for (int i = 0; i < fruitList.size(); i++) {
            Fruit fruit = fruitList.get(i);
            int quantity = quantities.get(i);
            double amount = fruit.getPrice() * quantity;
            System.out.println(fruit.getName() + " | " + fruit.getQuantity() + " | " + fruit.getPrice() + "$ | " + amount + "$");
        }
        System.out.println("Total: " + calculateTotal() + "$\n");
    }
}
