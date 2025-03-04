/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7_ex2_Shape;

/**
 *
 * @author selu3
 */
public class ShapeController {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{new Circle(5),
            new Square(4),
            new Triangle(3, 6),
            new Sphere(3),
            new Cube(2),
            new Tetrahedron(3)
        };

        ShapeController controller = new ShapeController();
        controller.display(shapes);
    }

    public void display(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof TwoDimensionalShape) {
                System.out.printf("Area: %.2f\n", ((TwoDimensionalShape) shape).getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                System.out.printf("Area: %.2f\n", ((ThreeDimensionalShape) shape).getArea());
                System.out.printf("Volume: %.2f\n", ((ThreeDimensionalShape) shape).getVolume());
            }
            System.out.println("---");
        }
    }
}
