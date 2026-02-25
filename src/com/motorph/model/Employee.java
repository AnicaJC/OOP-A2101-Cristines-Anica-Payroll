/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.model;

/**
 *
 * @author AJ
 */
public class Employee {

    private final String id;
    private final String lastName;
    private final String firstName;
    private final String fullName;
    private final String birthday;
    private final String address;
    private final String phone;
    private final String sss;
    private final String philhealth;
    private final String tin;
    private final String pagibig;
    private final String position;
    private final double hourlyRate;
    private final double basicSalary;

    private final double riceSubsidy;
    private final double phoneAllowance;
    private final double clothesAllowance;

    public Employee(String id, String lastName, String firstName, String birthday,
            String address, String phone, String position, double basicSalary,
            String sss, String philhealth, String tin, String pagibig,
            double hourlyRate, double riceSubsidy, double phoneAllowance,
            double clothesAllowance) {

        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.fullName = firstName + " " + lastName;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.sss = sss;
        this.philhealth = philhealth;
        this.tin = tin;
        this.pagibig = pagibig;
        this.position = position;
        this.basicSalary = basicSalary;
        this.hourlyRate = hourlyRate;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothesAllowance = clothesAllowance;

    }
    
    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getSss() {
        return sss;
    }

    public String getPhilhealth() {
        return philhealth;
    }

    public String getTin() {
        return tin;
    }

    public String getPagibig() {
        return pagibig;
    }

    public String getPosition() {
        return position;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getRiceSubsidy() {
        return riceSubsidy;
    }

    public double getPhoneAllowance() {
        return phoneAllowance;
    }

    public double getClothesAllowance() {
        return clothesAllowance;
    }
    
}
