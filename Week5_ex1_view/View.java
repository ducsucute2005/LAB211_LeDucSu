/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5_ex1_view;

import Week5_ex1_controller.CourseManagement;
import java.util.Scanner;

/**
 *
 * @author selu3
 */
public class View {

    CourseManagement courseMana = new CourseManagement();
    Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("*** Course Management ***");
            System.out.println("1. Add online course/ offline course");
            System.out.println("2. Update course");
            System.out.println("3. Delete course");
            System.out.println("4. Print all / online course / offline course");
            System.out.println("5. Search information based on course name");
            System.out.println("6. Exit");
            System.out.print("You choose: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    courseMana.addCourse();
                    break;
                case 2:
                    updateCourse();
                    break;
                case 3:
                    deleteCourse();
                    break;
                case 4:
                    courseMana.display();
                case 5:
                    searchCourse();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    public void updateCourse() {
        System.out.print("Enter Course ID to update: ");
        String courseId = sc.nextLine();
        courseMana.updateCourse(courseId);
    }

    public void deleteCourse() {
        System.out.print("Enter Course ID to delete: ");
        String courseId = sc.nextLine();
        courseMana.deleteCourse(courseId);
    }

    public void searchCourse() {
        System.out.print("Enter Course id to search: ");
        String courseID = sc.nextLine();
        courseMana.searchCourse(courseID);
    }

    public void display() {
        courseMana.display();
    }

    public static void main(String[] args) {
        View view = new View();
        view.menu();
    }

}
