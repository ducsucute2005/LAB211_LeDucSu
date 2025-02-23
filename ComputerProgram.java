/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

import java.util.Scanner;

/**
 *
 * @author selu3
 */
public class ComputerProgram {

    Scanner sc = new Scanner(System.in);

    public void normalCalculator() {
        System.out.println("Enter number: ");
        double num1 = Double.parseDouble(sc.nextLine());
        double result = num1;
        while (true) {
            System.out.println("Enter an operator (+, -, *, /, ^): ");
            char operator = checkOperator();
            if (operator == '=') {
                System.out.println("Result: " + result);
                return;
            }
            System.out.println("Enter number: ");
            double num2 = Double.parseDouble(sc.nextLine());
            result = calculator(result, operator, num2);
        }
    }

    public char checkOperator() {

        char operator = sc.next().charAt(0);
        sc.nextLine();
        while (true) {
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '^' || operator == '=') {
                return operator;
            } else {
                System.out.println("Invalid operator. Please try again.");
            }
        }
    }

    public double calculator(double a, char operator, double b) {
        switch (operator) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '*' -> {
                return a * b;
            }
            case '/' -> {
                return a / b;
            }
            case '^' -> {
                return Math.pow(a, b);
            }
            default ->
                throw new IllegalArgumentException("invalid operator" + operator);
        }
    }

    public void BMI() {
        double BMI = 0.0;
        System.out.println("Enter weight(kg): ");
        double weight=Double.parseDouble(sc.nextLine());
        System.out.println("Enter height(m): ");
        double height=Double.parseDouble(sc.nextLine());
        BMI = weight / (height * height);
        if (BMI < 19) {
            System.out.println("Under standard");
        } else if (BMI > 19 && BMI < 25) {
            System.out.println("Standard");
        } else if (BMI > 25 && BMI < 30) {
            System.out.println("Overweight");
        } else if (BMI > 30 && BMI < 40) {
            System.out.println("Fat-should lose weight");
        } else if (BMI > 40) {
            System.out.println("Very fat-shoule lose weight");
        }
    }

    public void display() {
        while (true) {
            System.out.println("\n--- Calculator Program ---");
            System.out.println("Choose a conversion:");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI calculator");
            System.out.println("3. Exitting...");
            System.out.println("Choose one option: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    normalCalculator();
                    break;
                case 2:
                    BMI();
                    break;
                case 3:
                    System.out.println("Exitting...");
            }
        }
    }
}
