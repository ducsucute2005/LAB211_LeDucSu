/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7_ex2_Shape;

/**
 *
 * @author selu3
 */
public abstract class TwoDimensionalShape extends Shape {

    public abstract double getArea();

    @Override
    public String getType() {
        return "Two-Dimensional Shape";
    }
}
