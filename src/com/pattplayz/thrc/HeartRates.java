package com.pattplayz.thrc;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int dobMonth;
    private int dobDay;
    private int dobYear;

    // Initializes Heart Rates object with specified attributes
    public HeartRates(String x, String y, int M, int D, int Y) {
        firstName = x;
        lastName = y;
        dobMonth = M;
        dobDay = D;
        dobYear = Y;
    }

    // Returns first name
    public String getFirstName() {
        return firstName;
    }

    // Sets first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Returns last name
    public String getLastName() {
        return lastName;
    }

    // Sets last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Returns Month of birth
    public int getDobMonth() {
        return dobMonth;
    }

    // Sets month of birth
    public void setDobMonth(int dobMonth) {
        this.dobMonth = dobMonth;
    }

    // Returns day of birth
    public int getDobDay() {
        return dobDay;
    }

    // Sets day of birth
    public void setDobDay(int dobDay) {
        this.dobDay = dobDay;
    }

    // Returns year of birth
    public int getDobYear() {
        return dobYear;
    }

    // Sets year of birth
    public void setDobYear(int dobYear) {
        this.dobYear = dobYear;
    }

    // Calculates age
    public int calculateAge() {
        LocalDate birthDate = LocalDate.of(dobYear, dobMonth, dobDay);
        LocalDate now = LocalDate.now();
        long years = ChronoUnit.YEARS.between(birthDate, now);
        return (int) years;
    }

    // Calculates target heart rate
    public double calculateTargetHR() {
        return 220 - calculateAge();
    }
}
