/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.util.ArrayList;
import java.util.List;

public class SolvingEquation {

    private double a;
    private double b;
    private double c;
    private List<Double> number;

    public SolvingEquation() {
    }

    public SolvingEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void superlativeEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("equation has many roots");
            } else {
                System.out.println("equation has no roots");
            }
        } else {
            double result = -b / a;
            System.out.println("Solution: x = " + result);
        }
    }

    public void QuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("The equation has many roots");
                } else {
                    System.out.println("The equation has no roots");
                }
            } else {
                double result = -c / b;
                System.out.printf("The solution is: x = %.3f%n", result);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("The equation has two distinct solutions: x1 = %.3f, x2 = %.3f%n", x1, x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("The equation has one double root: x = %.3f%n", x);
            } else {
                System.out.println("The equation has no root");
            }
        }
    }

    public boolean isOddNum(double num) {
        return num % 2 != 0;
    }

    public boolean isEvenNum(double num) {
        return num % 2 == 0;
    }

    public boolean isPerfectSquare(double num) {
        double sqrt = Math.sqrt(num);
        return sqrt == Math.floor(sqrt);
    }

    public void display(double a, double b, double c) {
        number = new ArrayList<>();
        if (a != 0) {
            number.add(a);
        }
        if (b != 0) {
            number.add(b);
        }
        if (c != 0) {
            number.add(c);
        }

        String oddNumbers = "";
        String evenNumbers = "";
        String perfectSquares = "";

        for (double num : number) {
            if (isOddNum(num)) {
                oddNumbers += num + ", ";
            }
            if (isEvenNum(num)) {
                evenNumbers += num + ", ";
            }
            if (isPerfectSquare(num)) {
                perfectSquares += num + ", ";
            }
        }

        if (!oddNumbers.isEmpty()) {
            System.out.println("Number is odd: " + oddNumbers.substring(0, oddNumbers.length() - 2));
        }
        if (!evenNumbers.isEmpty()) {
            System.out.println("Number is Even: " + evenNumbers.substring(0, evenNumbers.length() - 2));
        }
        if (!perfectSquares.isEmpty()) {
            System.out.println("Number is Perfect Square: " + perfectSquares.substring(0, perfectSquares.length() - 2));
        }
    }
}
