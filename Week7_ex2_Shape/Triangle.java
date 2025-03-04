/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7_ex2_Shape;

/**
 *
 * @author selu3
 */
public class Triangle extends TwoDimensionalShape {

    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + '}';
    }

}
