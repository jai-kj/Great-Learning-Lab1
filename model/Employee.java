package com.greatlearning.lab1.model;

public class Employee {
    private String firstName;
    private String lastName;
    
    public Employee() {
        firstName = "";
        lastName = "";
    }
    
    public Employee(String firstName, String  lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
        return lastName;
    }
}