/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5_ex2_model;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FlightInformation {

    private String flightNumber;
    private String seatNumber;
    private LocalDateTime timePickUp;
    
    public FlightInformation() {
        this.flightNumber = "";
        this.seatNumber = "";
        this.timePickUp = LocalDateTime.now();
    }
    
    public FlightInformation(String flightNumber, String seatNumber, String timePickUp) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        try {
            this.timePickUp = LocalDateTime.parse(timePickUp, formatter);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
    }

    

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getTimePickUp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return timePickUp.format(formatter);
    }

    public void setTimePickUp(LocalDateTime timePickUp) {
        this.timePickUp = timePickUp;
    }

    @Override
    public String toString() {

        return "Flight Number: " + flightNumber + ", Seat: " + seatNumber + ", Pickup Time: " + timePickUp;
    }
}
