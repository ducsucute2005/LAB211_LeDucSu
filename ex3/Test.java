/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.ex3;

import java.util.Scanner;

/**
 *
 * @author selu3
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--- Matrix Calculator ---");
            System.out.println("1. Addition of Matrices");
            System.out.println("2. Subtraction of Matrices");
            System.out.println("3. Multiplication of Matrices");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the number of rows for the matrices: ");
            int rows = Integer.parseInt(sc.nextLine());
            System.out.print("Enter the number of columns for the matrices: ");
            int cols = Integer.parseInt(sc.nextLine());

            Matrix matrix1 = new Matrix(rows, cols);
            System.out.println("Matrix 1:");
            matrix1.inputMatrix();

            Matrix matrix2 = new Matrix(rows, cols);
            System.out.println("Matrix 2:");
            matrix2.inputMatrix();

            try {
                Matrix result = null;
                switch (choice) {
                    case 1:
                        result = matrix1.additionMatrix(matrix2);
                        System.out.println("Result of Addition:");
                        result.displayMatrix();
                        break;
                    case 2:
                        result = matrix1.subtractionMatrix(matrix2);
                        System.out.println("Result of Subtraction:");
                        result.displayMatrix();
                        break;
                    case 3:
                        System.out.println("Enter the number of columns for the second matrix: ");
                        int colsMatrix2 = Integer.parseInt(sc.nextLine());
                        matrix2 = new Matrix(cols, colsMatrix2);
                        System.out.println("Matrix 2 (updated for multiplication):");
                        matrix2.inputMatrix();
                        result = matrix1.multiplicationMatrix(matrix2);
                        System.out.println("Result of Multiplication:");
                        result.displayMatrix();
                        break;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error, try again");
            }
        }
    }
}
