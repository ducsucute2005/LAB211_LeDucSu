/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4_ex2;

import java.util.*;

public class StudentAndTeacherManagement {

    Scanner sc = new Scanner(System.in);

    List<Teacher> teacherlist = new ArrayList<>();
    List<Student> studentlist = new ArrayList<>();

    public void inputTeachers() {
        int n = 0;
        while (true) {

            try {
                System.out.print("Enter number of teachers: ");
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("invalid, try agian");
            }
        }
        for (int i = 0; i < n; i++) {
            Teacher teacher = new Teacher();
            teacher.inputTeacher();
            teacherlist.add(teacher);
        }
    }

    public void printTeachers() {
        teacherlist.sort(Comparator.comparingInt(Teacher::getYearInProfession).reversed());
        System.out.println("List of Teachers sorted by experience:");
        for (Teacher teacher : teacherlist) {
            teacher.displayTeacher();
        }
    }

    public void inputStudents() {
        int n = 0;
        while (true) {

            try {
                System.out.print("Enter number of students: ");
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("invalid, try agian");
            }

        }
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.getName();
            student.inputStudent();
            studentlist.add(student);
        }
    }

    public void printStudents() {
        studentlist.sort(Comparator.comparingInt(Student::getYearOfAdmission));
        System.out.println("List of Students sorted by admission year:");
        for (Student student : studentlist) {
            student.displayStudent();
        }
    }

    public void searchPerson() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        List<Person> results = new ArrayList<>();
        for (Teacher teacher : teacherlist) {
            if (teacher.getName().equalsIgnoreCase(name)) {
                results.add(teacher);
            }
        }

        for (Student student : studentlist) {
            if (student.getName().equalsIgnoreCase(name)) {
                results.add(student);
            }
        }

        for (int i = 0; i < results.size() - 1; i++) {
            for (int j = i + 1; j < results.size(); j++) {
                if (results.get(i).getYearOfBirth() < results.get(j).getYearOfBirth()) {
                    Person temp = results.get(i);
                    results.set(i, results.get(j));
                    results.set(j, temp);
                }
            }
        }

        for (Person person : results) {
            person.display();
        }
        if (results.isEmpty()) {
            System.out.println("No person found with this name.");
        } else {
            for (Person person : results) {
                person.display();
            }
        }

    }

    public static void main(String[] args) {
        StudentAndTeacherManagement stuTeaMana = new StudentAndTeacherManagement();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Information Management");
            System.out.println("1. Enter teachers");
            System.out.println("2. Print teachers sorted by experience");
            System.out.println("3. Enter students");
            System.out.println("4. Print students sorted by admission year");
            System.out.println("5. Search person by name");
            System.out.println("6. Exit");
            System.out.print("You choose: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    stuTeaMana.inputTeachers();
                    break;
                case 2:
                    stuTeaMana.printTeachers();
                    break;
                case 3:
                    stuTeaMana.inputStudents();
                    break;
                case 4:
                    stuTeaMana.printStudents();
                    break;
                case 5:
                    stuTeaMana.searchPerson();
                    break;
            }
        } while (choice != 6);
    }
}
