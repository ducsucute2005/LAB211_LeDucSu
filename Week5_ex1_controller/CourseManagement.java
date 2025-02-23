/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5_ex1_controller;

/**
 *
 * @author selu3
 */
import Week5_ex1_model.Course;
import Week5_ex1_model.OfflineCourse;
import Week5_ex1_model.OnlineCourse;
import java.util.*;

public class CourseManagement {

    List<Course> courseList = new ArrayList<>();
    Course course = new Course();
    Scanner sc = new Scanner(System.in);

    public void addCourse() {
        String courseID;
        System.out.println("Enter courseID: ");
        courseID = sc.nextLine();

        String courseName = null;
        while (true) {
            System.out.println("Enter Course name: ");
            courseName = sc.nextLine();
            if (courseName.matches("[a-zA-Z ]{1,30}")) {
                break;
            } else {
                System.out.println("invalid courseID");
            }
        }
        int credit = 0;
        while (true) {
            try {
                System.out.println("Enter credits: ");
                credit = Integer.parseInt(sc.nextLine());
                if (credit > 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("invalid credits");
            }
        }
        char choose;
        while (true) {
            System.out.println("Choose O(online course) or F(offline course");
            choose = sc.nextLine().charAt(0);
            if (choose == 'O') {
                System.out.println("Platform: ");
                String platform = sc.nextLine();
                System.out.println("Instructors: ");
                String instructors = sc.nextLine();
                System.out.println("Note: ");
                String note = sc.nextLine();
                course = new OnlineCourse(courseID, courseName, credit, platform, instructors, note);
            } else if (choose == 'F') {
                System.out.println("Begin Date: ");
                String begin = sc.nextLine();
                System.out.print("End Date: ");
                String end = sc.nextLine();
                System.out.print("Campus: ");
                String campus = sc.nextLine();
                course = new OfflineCourse(courseID, courseName, credit, begin, end, campus);

            } else {
                System.out.println("Data input is invalid");
                return;

            }

            courseList.add(course);
            break;
        }
    }

    public void updateCourse(String courseId) {
        for (Course course : courseList) {
            if (course.getCourseID().equals(courseId)) {
                addCourse();
            } else {
                System.out.println("Data input is invalid");
            }
            return;
        }
        System.out.println("Course not found.");
    }

    public void deleteCourse(String courseId) {
        for (Course course : courseList) {
            if (course.getCourseID().equals(courseId)) {
                courseList.remove(course);
                System.out.println("Course deleted successfully.");
            }
        }
    }

    public void searchCourse(String search) {
        for (Course course : courseList) {
            if (course.getCourseID().equals(search)) {
                System.out.println("Course found successfully.");
                System.out.println(course);
            }
        }
        System.out.println("not found");
    }

    public void display() {
        for (Course course : courseList) {
            System.out.println(course);
        }
    }
}
