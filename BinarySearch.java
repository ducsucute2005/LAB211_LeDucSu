/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author selu3
 */
public class BinarySearch {

    private int[] array;
    private int size;
    private int searchNum;

    public BinarySearch() {
    }

    public BinarySearch(int[] array, int size, int searchNum) {
        this.array = array;
        this.size = size;
        this.searchNum = searchNum;
    }

    public void generate() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        size = Integer.parseInt(sc.nextLine());
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(30) + 1;
        }
        System.out.println("Enter number to search: ");
        searchNum = Integer.parseInt(sc.nextLine());
    }

    public int binarySearch(int[] array, int left, int right, int target) {
        int mid = left + (right - left) / 2;
        if (left > right) {
            return -1;
        }
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearch(array, left, mid - 1, target);
        } else {
            return binarySearch(array, mid + 1, right, target);
        }
    }

    public void display() {
        Arrays.sort(array);
        System.out.println("sorted array: " + Arrays.toString(array));
        int result = binarySearch(array, 0, array.length - 1, searchNum);
        if (result != -1) {
            System.out.println("Number " + searchNum + " found at index: " + result);
        } else {
            System.out.println("Number " + searchNum + " not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearch bSearch = new BinarySearch();
        bSearch.generate();
        bSearch.display();
    }
}
