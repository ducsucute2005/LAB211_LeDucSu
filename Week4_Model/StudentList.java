/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4_Model;

import java.util.*;

public class StudentList {

    public List<Student> studentlist = new ArrayList<>();
    Student student = new Student();

    public void createStudent(Student student) {
        studentlist.add(student);
    }

    public void findAndSort(String search) {
        for (Student student : studentlist) {
            if (student.getStudentName().equalsIgnoreCase(search)) {
                System.out.println(student);
            }
        }
        studentlist.sort(Comparator.comparing(Student::getStudentName));
    }

    public void UpdateOrDelete(String id, char choice) {
        boolean found = false;
        for (Student student : studentlist) {
            if (student.getId().equalsIgnoreCase(id) && (choice == 'U' || choice == 'u')) {
                createStudent(student);
                found = true;
                break;
            } else if (student.getId().equalsIgnoreCase(id) && (choice == 'D' || choice == 'd')) {
                studentlist.remove(student);
                found = true;
                break;
            }

        }
        
        if (!found) {
            System.out.println("student id: " + id + " not found");
        }
    }

    public void display() {
        for (Student student : studentlist) {
            System.out.println(student);
        }
    }
}
