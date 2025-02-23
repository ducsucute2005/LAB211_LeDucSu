/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4_ex2;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author selu3
 */
public class Teacher extends Person {

    private int yearInProfession;
    private String contractType;
    private double salaryCoefficient;

    public Teacher() {
        super();
        this.yearInProfession = 0;
        this.contractType = "";
        this.salaryCoefficient = 0;
    }
    Scanner sc = new Scanner(System.in);

    public void inputTeacher() {
        super.input();

        while (true) {
            try {
                System.out.print("Enter years in profession: ");
                yearInProfession = Integer.parseInt(sc.nextLine());
                int currentYear = Year.now().getValue();
                if (yearInProfession < currentYear) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("invalid, try again");
            }
        }

        while (true) {
            System.out.print("Enter contract type (Long/Short): ");
            contractType = sc.nextLine();
            if (contractType.equals("Long") || contractType.equals("Short")) {
                break;
            }
            System.out.println("contract type is invalid");
        }

        while (true) {
            try {
                System.out.print("Enter salary coefficient: ");
                salaryCoefficient = Double.parseDouble(sc.nextLine());
                if (salaryCoefficient >= 0) {

                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("invalid, try agian");
            }
        }

    }

    public int getYearInProfession() {
        return yearInProfession;
    }

    public void displayTeacher() {
        super.display();
        System.out.printf(" | %d | %s | %.1f\n", yearInProfession, contractType, salaryCoefficient);
    }
}
