/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.ex3;

/**
 *
 * @author selu3
 */
import java.util.Scanner;

class Matrix {

    private int rows;
    private int cols;
    private double[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    Scanner sc = new Scanner(System.in);

    public void inputMatrix() {
        System.out.println("Enter row " + rows + " columns " + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (true) {
                    System.out.print("Enter value for element [" + i + "][" + j + "]: ");
                    String input = sc.nextLine();
                    try {
                        data[i][j] = Double.parseDouble(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Values of matrix must be a number.");
                    }
                }
            }
        }
    }

    public void displayMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Matrix additionMatrix(Matrix matrix2) {
        Matrix result = new Matrix(rows, cols);
        if (this.rows != matrix2.rows || this.cols != matrix2.cols) {
            System.out.println("Matrices must have the same dimensions");

        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result.data[i][j] = this.data[i][j] + matrix2.data[i][j];
                }
            }

        }
        return result;
    }

    public Matrix subtractionMatrix(Matrix matrix2) {
        Matrix result = new Matrix(rows, cols);
        if (this.rows != matrix2.rows || this.cols != matrix2.cols) {
            System.out.println("Matrices must have the same dimensions");
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result.data[i][j] = this.data[i][j] - matrix2.data[i][j];
                }
            }
        }
        return result;
    }

    public Matrix multiplicationMatrix(Matrix matrix2) {
        Matrix result = new Matrix(this.rows, matrix2.cols);
        if (this.cols != matrix2.rows) {
            System.out.println("Number of columns in the first matrix must equal the number of rows in the second matrix for multiplication");
        } else {
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < matrix2.cols; j++) {
                    for (int k = 0; k < this.cols; k++) {
                        result.data[i][j] += this.data[i][k] * matrix2.data[k][j];
                    }
                }
            }
        }
        return result;
    }
}
