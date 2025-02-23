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
public class Student extends Person {

    private int yearOfAdmission;
    private double entranceEnglishScore;

    public Student() {
        super();
        this.yearOfAdmission = 0;
        this.entranceEnglishScore = 0.0;
    }
    Scanner sc = new Scanner(System.in);

    public void inputStudent() {
        super.input();

        while (true) {
            try {
                System.out.print("Enter year of admission: ");
                yearOfAdmission = Integer.parseInt(sc.nextLine());
                int currentYear = Year.now().getValue();
                if (yearOfAdmission < currentYear) {
                    break;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("invalid, try agian");
            }
        }

        while (true) {
            try {
                System.out.print("Enter entrance English score (0-100): ");
                entranceEnglishScore = Double.parseDouble(sc.nextLine());
                if (entranceEnglishScore >= 0 && entranceEnglishScore <= 100) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("invalid, try again");
            }
        }

    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void displayStudent() {
        super.display();
        System.out.printf(" | %d | %.1f\n", yearOfAdmission, entranceEnglishScore);
    }

}
