package com.cc.java;

public class Mitarbeiter {
    
private String lastName;
protected String firstName;
private int dateOfBirth;
public int workID;
public String department;
public String job;



public Mitarbeiter(String lastName, String firstName, int dateOfBirth) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.dateOfBirth = dateOfBirth;
    
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public String getLastName() {
    return lastName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getFirstName() {
    return firstName;
}

public void setDateOfBirth(int dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
}

public int getDateOfBirth() {
    return dateOfBirth;
}

public void hasLunch() {
    
}

public void startsWork() {
    
}



}

