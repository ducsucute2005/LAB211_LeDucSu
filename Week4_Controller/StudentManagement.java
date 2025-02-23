/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4_Controller;

import Week4_Model.Student;
import Week4_Model.StudentList;
import Week4_View.Menu;
import java.util.Scanner;

/**
 *
 * @author selu3
 */
public class StudentManagement extends Menu<String> {

    private StudentList studentlist;
    Scanner sc = new Scanner(System.in);

    public StudentManagement() {
        super("Student Management", new String[]{
            "Create a new student",
            "Find and Sort students",
            "Update/Delete students",
            "Report",
            "Quit"});
        studentlist = new StudentList();;

    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                CreateStudent();
                break;
            case 2:
                System.out.println("enter student to find: ");
                String search = sc.nextLine();
                studentlist.findAndSort(search);
                break;
            case 3:
                UpdateOrDelete();
                break;
            case 4:
                studentlist.display();
                break;
            default:
                System.out.println("Exiting...");
                break;
        }
    }

    public void CreateStudent() {

        System.out.print("Enter id: ");
        String id = sc.nextLine();

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();
        int semester = 0;
        while (true) {
            try {
                System.out.print("Enter semester: ");
                semester = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("invalid semester");
            }

        }
        String courseName = null;
        while (true) {
            try {
                System.out.print("Enter course name(must be .NET or JAVA or C/C++: ");
                courseName = sc.nextLine();
                if (courseName.equals(".NET") || courseName.equals("JAVA") || courseName.equals("C/C++")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("course name must have .NET or JAVA or C/C++");
            }
        }
        Student student = new Student(id, studentName, semester, courseName);
        studentlist.createStudent(student);
    }

    public void UpdateOrDelete() {
        System.out.print("Enter id: ");
        String id = sc.nextLine();

        while (true) {
            try {
                System.out.print("Enter choice(update choose U, delete choose D): ");
                char choose = sc.nextLine().charAt(0);
                studentlist.UpdateOrDelete(id, choose);
                System.out.print("Enter id: ");
                String id1 = sc.nextLine();
                System.out.print("Enter student name: ");
                String studentName = sc.nextLine();
                int semester = 0;
                while (true) {
                    try {
                        System.out.print("Enter semester: ");
                        semester = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("invalid semester");
                    }

                }
                String courseName = null;
                while (true) {
                    try {
                        System.out.print("Enter course name(must be .NET or JAVA or C/C++: ");
                        courseName = sc.nextLine();
                        if (courseName.equals(".NET") || courseName.equals("JAVA") || courseName.equals("C/C++")) {
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("course name must have .NET or JAVA or C/C++");
                    }
                }
                Student student = new Student(id1, studentName, semester, courseName);
                studentlist.createStudent(student);

                break;
            } catch (NumberFormatException e) {
                System.out.println("invalid choice");
            }

        }
    }

    public static void main(String[] args) {
        StudentManagement stumana = new StudentManagement();
        stumana.run();
    }
}
