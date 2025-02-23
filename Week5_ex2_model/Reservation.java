/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5_ex2_model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Reservation {

    private String bookingID;
    private String customerName;
    private String phoneNumber;
    private String roomNumber;
    private LocalDateTime bookingDate;
    private FlightInformation flightInformation;

    public Reservation() {
        this.bookingID = "";
        this.customerName = "";
        this.phoneNumber = "";
        this.roomNumber = "";
        this.bookingDate = LocalDateTime.now();
        this.flightInformation = new FlightInformation();
    }

    public Reservation(String bookingID, String customerName, String phoneNumber, String roomNumber, String bookingDate, FlightInformation flightInformation) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        try {
            this.bookingDate = LocalDateTime.parse(bookingDate, formatter);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        this.flightInformation = flightInformation;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBookingDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return bookingDate.format(formatter);
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public FlightInformation getFlightInformation() {
        return flightInformation;
    }

    public void setFlightInformation(FlightInformation flightInformation) {
        this.flightInformation = flightInformation;
    }

    @Override
    public String toString() {

        return "Booking ID: " + bookingID + ", Name: " + customerName + ", Phone: " + phoneNumber
                + ", Room: " + roomNumber + ", Booking Date: " + bookingDate
                + "\nFlight Info: " + flightInformation;
    }
}
