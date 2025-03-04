/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7_ex2_Shape;

/**
 *
 * @author selu3
 */
public class Tetrahedron extends ThreeDimensionalShape {

    private double side;

    public Tetrahedron(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.sqrt(3) * Math.pow(side, 2);
    }

    public double getVolume() {
        return (1.0 / 12) * Math.sqrt(2) * Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return "Tetrahedron{" + "side=" + side + '}';
    }
}
