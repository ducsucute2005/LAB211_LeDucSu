/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author selu3
 */
public class ConvertBaseNum {

    int dec = 0;
    String result = "";

    public void HexToDec(String hex) {
        int length = hex.length();
        for (int i = 0; i < length; i++) {
            char hexChar = hex.charAt(i);
            int digit = hexChar >= '0' && hexChar <= '9' ? hexChar - '0' : hexChar - 'A' + 10;
            dec = dec * 16 + digit;
        }
        result = String.valueOf(dec);
    }

    public void HexToBin(String hex) {
        StringBuilder binary = new StringBuilder();
        for (char hexChar : hex.toCharArray()) {
            String bin = Integer.toBinaryString(hexChar >= '0' && hexChar <= '9' ? hexChar - '0' : hexChar - 'A' + 10);
            while (bin.length() < 4) {
                bin = "0" + bin;
            }
            binary.append(bin);
        }
        result = binary.toString(); 
    }

    public void DecToBin(int dec) {

        StringBuilder binary = new StringBuilder();
        if (dec == 0) {
            binary.append("0");
        } else {
            while (dec > 0) {
                binary.insert(0, dec % 2);
                dec /= 2;
            }
        }
        result = binary.toString();
    }

    public void DecToHex(int dec) {

        StringBuilder hex = new StringBuilder();
        if (dec == 0) {
            hex.append("0");
        } else {
            while (dec > 0) {
                int remainder = dec % 16;
                char hexChar = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + remainder - 10);
                hex.insert(0, hexChar);
                dec /= 16;
            }
        }
        result = hex.toString();
    }

    public void BinToDec(String binary) {
        binary = null;
        for (int i = 0; i < binary.length(); i++) {
            char binChar = binary.charAt(i);
            if (binChar == '1') {
                dec += Math.pow(2, binary.length() - i - 1);
            }
        }
        result = String.valueOf(dec);
    }

    public void BinToHex(String binary) {
        binary = null;

        for (int i = 0; i < binary.length(); i++) {
            char binChar = binary.charAt(i);
            if (binChar == '1') {
                dec += Math.pow(2, binary.length() - i - 1);
            }
        }
        StringBuilder hex = new StringBuilder();
        if (dec == 0) {
            hex.append("0");
        } else {
            while (dec > 0) {
                int remainder = dec % 16;
                char hexChar = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + remainder - 10);
                hex.insert(0, hexChar);
                dec /= 16;
            }
        }
        result=hex.toString();
    }

    public void display() {
        System.out.println("Number after converting: "+result);
    }
}
