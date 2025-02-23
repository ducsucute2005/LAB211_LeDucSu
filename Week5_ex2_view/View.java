/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5_ex2_view;

import Week5_ex2_controller.RoomManagement;
import Week5_ex2_model.FlightInformation;
import Week5_ex2_model.Reservation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class View {

    RoomManagement manager = new RoomManagement();
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public void Menu() {
        while (true) {
            System.out.println("*** Reservation System ***");
            System.out.println("1. Add Reservation");
            System.out.println("2. Search & Update Reservation");
            System.out.println("3. Search & Delete Reservation");
            System.out.println("4. Print All Reservations");
            System.out.println("5. Print Pickup Reservations");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addReservation();
                    break;
                case 2:
                    updateReservation();
                    break;
                case 3:
                    deleteReservation();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    manager.printPickUpReservations();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public void addReservation() {
        String bookingID = null;
        while (true) {
            System.out.print("Booking ID (6 digits): ");
            bookingID = sc.nextLine();
            if (bookingID.matches("[0-9]{6}")) {
                break;
            } else {
                System.out.println("invalid id");
            }
        }

        System.out.print("Customer Name: ");
        String customerName = sc.nextLine();

        String phoneNumber = null;
        while (true) {
            System.out.print("Phone Number (12 digits): ");
            phoneNumber = sc.nextLine();
            if (phoneNumber.matches("[0-9]{10,12}")) {
                break;
            } else {
                System.out.println("invalid number");
            }
        }

        String roomNumber = null;
        while (true) {
            System.out.print("Room Number (4 digits): ");
            roomNumber = sc.nextLine();
            if (roomNumber.matches("[0-9]{4}")) {
                break;
            } else {
                System.out.println("invalid room number");
            }
        }

        String bookingDate = null;
        while (true) {
            try {
                System.out.print("Booking Date (dd/MM/yyyy HH:mm): ");
                bookingDate = sc.nextLine();
                LocalDateTime localdatetime = LocalDateTime.parse(bookingDate, formatter);
                System.out.println("Booking date confirmed: " + localdatetime.format(formatter));
                break;
            } catch (DateTimeParseException e) {
                System.out.println("invalid, try again");
            }
        }
        System.out.print("Flight Number: ");
        String flightNumber = sc.nextLine();
        System.out.print("Seat Number: ");
        String seatNumber = sc.nextLine();

        String timePickUp = null;
        while (true) {
            try {
                System.out.print("Pickup Time (dd/MM/yyyy HH:mm): ");
                timePickUp = sc.nextLine();
                LocalDateTime localdatetime = LocalDateTime.parse(timePickUp, formatter);
                System.out.println("Booking date confirmed: " + localdatetime.format(formatter));
                break;
            } catch (DateTimeParseException e) {
                System.out.println("invalid, try again");
            }
        }

        FlightInformation flightInfo = new FlightInformation(flightNumber, seatNumber, timePickUp);
        Reservation reservation = new Reservation(bookingID, customerName, phoneNumber, roomNumber, bookingDate, flightInfo);
        manager.addReservation(bookingID, customerName, phoneNumber, roomNumber, bookingDate, flightInfo, flightNumber, seatNumber, timePickUp);
        System.out.println("Reservation added successfully!");
    }

    public void updateReservation() {
        System.out.print("Enter booking ID to update: ");
        String bookingID = sc.nextLine();
        manager.updateReservation(bookingID);
    }

    public void deleteReservation() {
        System.out.print("Enter booking ID to delete: ");
        String bookingID = sc.nextLine();
        manager.deleteReservation(bookingID);
    }

    public void searchReservation() {
        System.out.print("Enter bookinh id to search: ");
        String bookingID = sc.nextLine();
        manager.searchReservation(bookingID);
    }

    public void display() {
        manager.display();
    }

    public static void main(String[] args) {
        View view = new View();
        view.Menu();
    }
}
