/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6_ex1_controller;

import Week6_ex1_model.SalaryHistory;
import Week6_ex1_model.Worker;
import Week6_ex1_view.Menu;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author selu3
 */
public class WorkManagement {

    List<Worker> workerList = new ArrayList<>();
    List<SalaryHistory> salaryList = new ArrayList<>();
    Worker worker = new Worker();

    public boolean addWorker(String id, String name, int age, double salary, String date) {
        if (id == null || id.isEmpty()) {
            System.out.println("Worker ID cannot be null");
            return false;
        }
        for (Worker worker : workerList) {
            if (worker.getId().equals(id)) {
                System.out.println("id is duplicated");
                return false;
            }
        }
        if (age < 18 || age > 50) {
            System.out.println("Age must be between 18 and 50.");
            return false;
        }
        if (salary <= 0) {
            System.out.println("Salary must be greater than 0.");
            return false;
        }
        Worker worker = new Worker(id, name, age, salary, date);
        workerList.add(worker);
        System.out.println("Worker added successfully.");
        return true;
    }

    public boolean changeSalary(String status, String id, double amount) {
        Worker worker = null;
        for (Worker w : workerList) {
            if (w.getId().equals(id)) {
                worker = w;
                break;
            }
        }
        if (worker == null) {
            System.out.println("Error: Worker ID does not exist.");
            return false;
        }
        if (amount <= 0) {
            System.out.println("Error: Amount must be greater than 0.");
            return false;
        }

        if (!status.equalsIgnoreCase("UP") && !status.equalsIgnoreCase("DOWN")) {
            System.out.println("Error: Status must be up or down.");
            return false;
        }
        double newSalary = status.equalsIgnoreCase("UP") ? worker.getSalary() + amount : worker.getSalary() - amount;
        if (newSalary < 0) {
            System.out.println("Error: Salary cannot be negative.");
            return false;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = sdf.format(new Date());
        salaryList.add(new SalaryHistory(id, worker.getName(), worker.getAge(), worker.getSalary(), status, formattedDate));
        worker.setSalary(newSalary);
        System.out.println("Salary updated successfully.");
        return true;
    }

    public void getInformationSalary() {
        if (salaryList.isEmpty()) {
            System.out.println("No salary adjustments recorded.");
            return;
        }
        if (workerList.isEmpty()) {
            System.out.println("Error: No workers available to modify salary.");
            return ;
        }
        System.out.println("--------------------Display Information Salary-----------------------");
        System.out.println("Code\tName\tAge\tSalary\tStatus\tDate");
        for (SalaryHistory salahis : salaryList) {
            System.out.println(salahis.getId() + "\t" + salahis.getName() + "\t" + salahis.getAge() + "\t" + salahis.getSalary() + "\t" + salahis.getStatus() + "\t" + salahis.getDate());
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.start();
    }

}
