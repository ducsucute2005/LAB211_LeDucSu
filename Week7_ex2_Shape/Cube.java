/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7_ex2_Shape;

/**
 *
 * @author selu3
 */
public class Cube extends ThreeDimensionalShape {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getArea() {
        return 6 * Math.pow(side, 2);
    }

    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return "Cube{" + "side=" + side + '}';
    }

}
