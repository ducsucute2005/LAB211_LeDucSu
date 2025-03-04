/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7_ex2_Shape;

/**
 *
 * @author selu3
 */
public class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    
    public double getArea(){
        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
    
}
