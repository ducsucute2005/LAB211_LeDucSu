/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import Week1.ArraySearch;
import Week1.CharLetterCount;
import Week1.ConvertBaseNum;
import Week1.SolvingEquation;
import java.util.Scanner;

public class MyLab211 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
//        ArraySearch arrSearch = new ArraySearch();
//        System.out.println("Enter positive number of array: ");
//        int num=Integer.parseInt(sc.nextLine());
//        arrSearch = new ArraySearch(num, null);
//        
//        arrSearch.random();
//        
//        System.out.println("Enter number to search");
//        int searchNum=Integer.parseInt(sc.nextLine());
//        arrSearch.searchInArray(searchNum);
//        arrSearch.display();
//
// EX2
//        CharLetterCount count = new CharLetterCount();
//        String sentence=sc.nextLine();
//        count.wordCount(sentence);
//        count.letterCount(sentence);
//        count.display();

//EX3
        // ConvertBaseNum convert = new ConvertBaseNum();
//        while (true) {
//            System.out.println("\n--- Base Converter Program ---");
//            System.out.println("Choose a conversion:");
//            System.out.println("1. Hexadecimal to Decimal");
//            System.out.println("2. Hexadecimal to Binary");
//            System.out.println("3. Decimal to Binary");
//            System.out.println("4. Decimal to Hexadecimal");
//            System.out.println("5. Binary to Decimal");
//            System.out.println("6. Binary to Hexadecimal");
//            System.out.print("Enter your choice: ");
//            int choice = Integer.parseInt(sc.nextLine());
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter number to convert: ");
//                    String hex1=sc.nextLine();
//                    convert.HexToDec(hex1);
//                    convert.display();
//                    break;
//                case 2:
//                    System.out.println("Enter number to convert: ");
//                    String hex2=sc.nextLine();
//                    convert.HexToBin(hex2);
//                    convert.display();
//                    break;
//                case 3:
//                    System.out.println("Enter number to convert: ");
//                    int dec1=Integer.parseInt(sc.nextLine());
//                    convert.DecToBin(dec1);
//                    convert.display();
//                    break;
//                case 4:
//                    System.out.println("Enter number to convert: ");
//                    int dec2=Integer.parseInt(sc.nextLine());
//                    convert.DecToHex(dec2);
//                    convert.display();
//                    break;
//                case 5:
//                    System.out.println("Enter number to convert: ");
//                    String bin1=sc.nextLine();
//                    convert.BinToDec(bin1);
//                    convert.display();
//                    break;
//                case 6:
//                    System.out.println("Enter number to convert: ");
//                    String bin2=sc.nextLine();
//                    convert.BinToHex(bin2);
//                    convert.display();
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//EX4
        SolvingEquation sol = new SolvingEquation();
        while (true) {
            System.out.println("========= Equation Program =========");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            System.out.println("Choose one option: ");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                System.out.println("----- Calculate Equation -----");
                System.out.println("Enter A: ");
                double a = Double.parseDouble(sc.nextLine());
                System.out.println("Enter B: ");
                double b = Double.parseDouble(sc.nextLine());

                sol.superlativeEquation(a, b);
                sol.display(a, b, 0);

            } else if (choice == 2) {
                System.out.println("----- Calculate Quadratic Equation -----");
                System.out.println("Enter A: ");
                double a = Double.parseDouble(sc.nextLine());
                System.out.println("Enter B: ");
                double b = Double.parseDouble(sc.nextLine());
                System.out.println("Enter C: ");
                double c = Double.parseDouble(sc.nextLine());

                sol.QuadraticEquation(a, b, c);
                sol.display(a, b, c);

            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }
        }
    }
}
