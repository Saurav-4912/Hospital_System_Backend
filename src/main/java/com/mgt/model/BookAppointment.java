package com.mgt.model;

import jakarta.persistence.*;

@Entity
@Table(name="appointments")
public class BookAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="fullName")
    private String fullName;

    @Column(name="email")
    private String email;

    @Column(name="mobileNo")
    private String mobileNo;

    @Column(name="disease")
    private String disease;

    @Column(name="address")
    private String address;

    @Column(name="gender")
    private String gender;

    @Column(name="age")
    private int age;

    public BookAppointment() {
    }

    public BookAppointment(Long id, String fullName, String email, String mobileNo, String disease, String address, String gender, int age) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.mobileNo = mobileNo;
        this.disease = disease;
        this.address = address;
        this.gender = gender;
        this.age = age;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
