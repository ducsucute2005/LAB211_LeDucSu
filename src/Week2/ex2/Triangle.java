/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.ex2;


/**
 *
 * @author selu3
 */
public class Triangle extends Shape {

        private double side1;
        private double side2;
        private double side3;

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public double Perimeter() {
            return side1 + side2 + side3;
        }

        public double Area() {
            double halfperi = Perimeter() / 2;
            return Math.sqrt(halfperi * (halfperi - side1) * (halfperi - side2) * (halfperi - side3));
        }

        public void display() {
            System.out.println("-----Triangle-----");
            System.out.println("Side1: " + side1);
            System.out.println("Side2: " + side2);
            System.out.println("Side3: " + side3);
            System.out.println("Area: " + Area());
            System.out.println("Perimeter: " + Perimeter());
        }
    }
