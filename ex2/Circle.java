/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.ex2;

/**
 *
 * @author selu3
 */
public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double Perimeter() {
        return radius * 2 * Math.PI;
    }

    public double Area() {
        return radius * radius * Math.PI;
    }

    public void display() {
        System.out.println("-----Circle-----");
        System.out.println("radius: " + radius);
        System.out.println("Area: " + Area());
        System.out.println("Perimeter: " + Perimeter());
    }
}
