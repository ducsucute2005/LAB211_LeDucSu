/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7_ex1_controller;

/**
 *
 * @author selu3
 */
import Week7_ex1_model.Fruit;
import Week7_ex1_model.Order;
import Week7_ex1_view.Menu;
import java.util.ArrayList;
import java.util.List;

public class FruitShopController {

    private List<Fruit> fruitList = new ArrayList<>();
    private List<Order> orderList = new ArrayList<>();

    public void addFruit(String id, String name, double price, int quantity, String origin) {
        fruitList.add(new Fruit(id, name, price, quantity, origin));
    }

    public List<Fruit> getFruits() {
        return fruitList;
    }

    public void addOrder(String customerName, List<String> fruitIds, List<Integer> quantities) {
        Order newOrder = new Order(customerName, this);

        for (int i = 0; i < fruitIds.size(); i++) {
            String fruitId = fruitIds.get(i);
            int quantity = quantities.get(i);

            Fruit fruit = findFruitById(fruitId);
            if (fruit != null && fruit.getQuantity() >= quantity) {
                newOrder.addItem(fruitId, quantity);
                fruit.setQuantity(fruit.getQuantity() - quantity);
            }
        }

        orderList.add(newOrder);
    }

    public Fruit findFruitById(String fruitId) {
        for (Fruit fruit : fruitList) {
            if (fruit.getId().equals(fruitId)) {
                return fruit;
            }
        }
        return null;
    }

    public List<Order> getOrders() {
        return orderList;
    }

    public boolean updateFruitStock(String fruitId, int quantity) {
        for (Fruit fruit : fruitList) {
            if (fruit.getId().equals(fruitId) && fruit.getQuantity() >= quantity) {
                fruit.setQuantity(fruit.getQuantity() - quantity);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu();
    }
}
