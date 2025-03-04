/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7_ex2_Shape;

/**
 *
 * @author selu3
 */
public class Sphere extends ThreeDimensionalShape {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere{" + "radius=" + radius + '}';
    }

}
