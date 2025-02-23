/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5_ex2_controller;

import Week5_ex2_model.FlightInformation;
import Week5_ex2_model.Reservation;
import Week5_ex2_view.View;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class RoomManagement {

    private List<Reservation> reservationList = new ArrayList<>();

    public void addReservation(String bookingID, String customerName, String phoneNumber, String roomNumber, String bookingDate, FlightInformation flightInformation, String flightNumber, String seatNumber, String timePickUp) {
        Reservation reser = new Reservation(bookingID, customerName, phoneNumber, roomNumber, bookingDate, flightInformation);
        FlightInformation flight = new FlightInformation(flightNumber, seatNumber, timePickUp);
        reservationList.add(reser);

    }

    public void searchReservation(String bookingID) {
        boolean found = false;
        for (Reservation reser : reservationList) {
            if (reser.getBookingID().equals(bookingID)) {
                System.out.println("Booking ID found:");
                System.out.println(reser);
                found = true;
                return;
            }
        }
        if (!found) {
            System.out.println("Booking ID not found.");
        }
    }

    public void updateReservation(String bookingID) {
        searchReservation(bookingID);
        for (Reservation reser : reservationList) {
            if (reser.getBookingID().equals(bookingID)) {
                View view = new View();
                view.addReservation();
                reservationList.add(reser);
                System.out.println("Reservation updated successfully!");
            } else {
                System.out.println("invalid id");
            }
        }
        System.out.println("not found.");
    }

    public void deleteReservation(String bookingID) {
        searchReservation(bookingID);
        for (Reservation reser : reservationList) {
            if (reser.getBookingID().equals(bookingID)) {
                reservationList.remove(reser);
            }
        }
    }

    public void display() {
        for (Reservation res : reservationList) {
            System.out.println(res);
            System.out.println("--------------------------------------");
        }
    }

    public void printPickUpReservations() {
        List<Reservation> sortedList = reservationList.stream()
                .filter(res -> res.getFlightInformation() != null && res.getFlightInformation().getTimePickUp() != null)
                .sorted(Comparator.comparing(res -> res.getFlightInformation().getTimePickUp()))
                .toList(); 

        sortedList.forEach(System.out::println);
    }
}
