/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5_ex3;

/**
 *
 * @author selu3
 */
import java.util.Scanner;

public class LargeNumber {

    public static String addLargeNumbers(String num1, String num2) {
        int maxLength = Math.max(num1.length(), num2.length());
        int[] result = new int[maxLength + 1];

        int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1, k = maxLength;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;
            int sum = digit1 + digit2 + carry;

            result[k--] = sum % 10;
            carry = sum / 10;
        }

        StringBuilder sumResult = new StringBuilder();
        for (int x = (result[0] == 0 ? 1 : 0); x < result.length; x++) {
            sumResult.append(result[x]);
        }
        return sumResult.toString();
    }

    public static String multiplyLargeNumbers(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        int[] result = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int tempSum = product + result[i + j + 1];

                result[i + j + 1] = tempSum % 10;
                result[i + j] += tempSum / 10;
            }
        }

        StringBuilder productResult = new StringBuilder();
        for (int num : result) {
            if (!(productResult.length() == 0 && num == 0)) {
                productResult.append(num);
            }
        }

        return (productResult.length() == 0) ? "0" : productResult.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter num 1: ");
        String num1 = scanner.nextLine();

        System.out.print("enter num 2: ");
        String num2 = scanner.nextLine();

        String sum = addLargeNumbers(num1, num2);
        String product = multiplyLargeNumbers(num1, num2);

        System.out.println("sum: " + sum);
        System.out.println("multiply: " + product);

        scanner.close();
    }
}
