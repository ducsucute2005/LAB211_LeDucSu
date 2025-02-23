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
public class Person {

    private String id;
    private String name;
    private String phonenum;
    private int yearOfBirth;
    private String major;

    public Person() {
        this.id = "";
        this.name = "";
        this.phonenum = "";
        this.yearOfBirth = 0;
        this.major = "";
    }
    Scanner sc = new Scanner(System.in);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void input() {
        while (true) {
            System.out.print("Enter ID (6 digits): ");
            id = sc.nextLine();
            if (id.matches("[0-9]{6}")) {
                break;
            } else {
                System.out.println("ID is invalid");
            }
        }

        while (true) {
            System.out.print("Enter full name (only alphabets and spaces): ");
            name = sc.nextLine();
            if (name.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("name is invalid");
            }
        }

        while (true) {
            System.out.print("Enter phone number (12 digits): ");
            phonenum = sc.nextLine();
            if (phonenum.matches("[0-9]{12}")) {
                break;
            } else {
                System.out.println("phone number is invalid");
            }
        }

        while (true) {
            try {
                System.out.print("Enter year of birth (before current year): ");
                yearOfBirth = Integer.parseInt(sc.nextLine());
                int currentYear = Year.now().getValue();
                if (yearOfBirth < currentYear) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("invalid,try again");
            }
        }

        while (true) {
            System.out.print("Enter major (max 30 characters): ");
            major = sc.nextLine();
            if (major.length() <= 30) {
                break;
            } else {
                System.out.println("major is invalid");
            }
        }
    }

    public void display() {
        System.out.printf("%s | %s | %s | %d | %s", id, name, phonenum, yearOfBirth, major);
    }

}
