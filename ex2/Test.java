/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.ex2;

import java.util.Scanner;

/**
 *
 * @author selu3
 */
public class Test {

    public static void main(String[] args) {
        // ex2 
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Calculate Perimeter and area ---");
            System.out.println("Choose a conversion:");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");
            System.out.println("Choose one option: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter width ");
                    double width = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter length ");
                    double length = Double.parseDouble(sc.nextLine());
                    Rectangle rec = new Rectangle(width, length);
                    rec.Perimeter();
                    rec.Area();
                    rec.display();
                    break;
                case 2:
                    System.out.println("enter side 1 ");
                    double side1 = Double.parseDouble(sc.nextLine());
                    System.out.println("enter side 2 ");
                    double side2 = Double.parseDouble(sc.nextLine());
                    System.out.print("enter side 3 ");
                    double side3 = Double.parseDouble(sc.nextLine());
                    Triangle tri = new Triangle(side1, side2, side3);
                    tri.Area();
                    tri.Perimeter();
                    tri.display();
                    break;
                case 3:
                    System.out.println("enter radius ");
                    double radius = Double.parseDouble(sc.nextLine());
                    Circle cir=new Circle(radius);
                    cir.Area();
                    cir.Perimeter();
                    cir.display();
                    break;
                default:
                    System.out.println("Invalid choice, try again");
                    break;
            }
        }
    }
}


