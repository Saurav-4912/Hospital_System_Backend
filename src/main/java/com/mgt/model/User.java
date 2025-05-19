package com.mgt.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;



@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private int age;

    private String address;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Patient patient;


    public User() {
    }


    public User(Long id, String firstName, String lastName, int age, String address, String username, String password,
            Role role, Patient patient) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.username = username;
        this.password = password;
        this.role = role;
        this.patient = patient;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public Role getRole() {
        return role;
    }


    public void setRole(Role role) {
        this.role = role;
    }


    public Patient getPatient() {
        return patient;
    }


    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    
}
