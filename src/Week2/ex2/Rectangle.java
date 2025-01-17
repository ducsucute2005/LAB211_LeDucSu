/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.ex2;



/**
 *
 * @author selu3
 */
public class Rectangle extends Shape {

        private double width;
        private double length;

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public double Perimeter() {
            return 2 * (width + length);
        }

        public double Area() {
            return width * length;
        }

        public void display() {
            System.out.println("-----Rectangle-----");
            System.out.println("Width: " + width);
            System.out.println("Length: " + length);
            System.out.println("Area: " + Area());
            System.out.println("Perimeter: " + Perimeter());

        }
}
