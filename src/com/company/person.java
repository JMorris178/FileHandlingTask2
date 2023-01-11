package com.company;

public class person {
    private String firstName;
    private String lastName;
    private Integer number;
    private String department;
    private String role;

    public person(String firstName, String lastName, Integer number, String department, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.department = department;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDepartment() {
        return department;
    }

    public String getRole() {
        return role;
    }
}
