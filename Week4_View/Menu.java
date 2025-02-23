/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4_View;

/**
 *
 * @author selu3
 */
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu<T> {

    protected String title;
    protected ArrayList<T> options;

    public Menu() {
    }

    public Menu(String title, String[] options) {
        this.title = title;
        this.options = new ArrayList<>();
        for (String s : options) {
            this.options.add((T) s);
        }
    }

    public void display() {
        System.out.println(title);
        System.out.println("--------------------------------");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.println("Enter another option to exit the menu");
        System.out.println("--------------------------------");
    }

    public int getSelected() {
        display();
        Scanner sc = new Scanner(System.in);
        int result;
        System.out.print("Enter selection: ");
        while (true) {
            try {
                result = Integer.parseInt(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Enter a number.");
                System.out.print("Enter again: ");
            }
        }
    }

    public abstract void execute(int n);

    public void run() {
        while (true) {
            int n = getSelected();
            if (n <= options.size()) {
                execute(n);
            } else {
                break;
            }
        }
    }
}
