/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author selu3
 */
public class QuickSort {

    private int[] array;
    private int size;
    private int pivot;

    public QuickSort() {
    }

    public QuickSort(int[] array, int size, int pivot) {
        this.array = array;
        this.size = size;
        this.pivot = pivot;
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

    public int partition(int[] array, int low, int high) {
        pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void display() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort quicksort = new QuickSort();
        quicksort.generate();
        System.out.println("Array before sorting:");
        quicksort.display();
        quicksort.quickSort(quicksort.array, 0, quicksort.size - 1);
        System.out.println("Array after sorting:");
        quicksort.display();
    }
}
