/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week1;

import java.util.Random;


public class ArraySearch {

    private int num;
    private int array[];
    

    public ArraySearch() {
    }

    public ArraySearch(int num, int[] array) {
        this.num = num;
        this.array = array;
    }

    int searchNum;

    public void random() {
        Random random = new Random();
        array = new int[num];
        System.out.println("Generated array:");
        for (int i = 0; i < num; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
    }

    public void searchInArray( int searchNum) {
        System.out.println("Searching for the number: " + searchNum);
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNum) {
                System.out.println("Number found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }
    }

    public void display() {
        if (array == null) {
            System.out.println("Array is empty");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
