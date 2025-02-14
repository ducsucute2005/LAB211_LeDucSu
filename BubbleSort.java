/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

    private int[] array;
    private int size;

    public BubbleSort(int[] array, int size) {
        this.array = new int[size];
        this.size = size;
    }

    public BubbleSort() {

    }

    public void generate() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        size = Integer.parseInt(sc.nextLine());
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
        }
    }

    public void bubbleSort() {
        boolean check = false;
        int count = 0;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            check = false;
            for (int j = 0; j < n - 1 - i && !check; j++) {
                check = true;
                count++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = false;
                }
            }
        }
        System.out.println("count: " + count);
    }

    public void displayArray() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort bubsort = new BubbleSort();
        bubsort.generate();
        System.out.println("The array before bubble sort");
        bubsort.displayArray();
        bubsort.bubbleSort();
        System.out.println("The array after bubble sort");
        bubsort.displayArray();
    }

}
