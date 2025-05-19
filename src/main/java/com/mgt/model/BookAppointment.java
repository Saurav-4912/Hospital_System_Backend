package com.mgt.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="appointments")
public class BookAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="fullName")
    private String fullName;

    @Column(name="contactNumber")
    private String contactNumber;

    @Column(name="selectedDate")
    private LocalDate selectedDate;

    @Column(name="selectedTime")
    private LocalTime selectedTime;

    @Column(name="message")
    private String message;

    public BookAppointment() {
    }

    public BookAppointment(Long id, String fullName, String contactNumber, LocalDate selectedDate, LocalTime selectedTime, String message) {
        this.id = id;
        this.fullName = fullName;
        this.contactNumber = contactNumber;
        this.selectedDate = selectedDate;
        this.selectedTime = selectedTime;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public LocalDate getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(LocalDate selectedDate) {
        this.selectedDate = selectedDate;
    }

    public LocalTime getSelectedTime() {
        return selectedTime;
    }

    public void setSelectedTime(LocalTime selectedTime) {
        this.selectedTime = selectedTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
