package com.Lessons;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String email;
    protected userStatus status;
    protected LocalDate timeStamp;

    public User(String firstName, String lastName, int age, String email, userStatus status, LocalDate timeStamp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.status = status;
        this.timeStamp = timeStamp;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(userStatus status) {
        this.status = status;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public userStatus getStatus() {
        return status;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        return "FirstName : " + firstName + '\n' +
                "LastName : " + lastName + '\n' +
                "Age : " + age + '\n' +
                "Email : " + email + '\n' +
                "Current status : " + status + '\n' +
                "Time of registration : " + timeStamp.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + '\n';
    }
}
