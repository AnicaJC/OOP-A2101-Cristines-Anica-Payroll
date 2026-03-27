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
    private String lastName;
    private String firstName;
    private String fullName;
    private String birthday;
    private String address;
    private String phone;
    private final String sss;
    private final String philhealth;
    private final String tin;
    private final String pagibig;
    private String position;
    private double hourlyRate;
    private double basicSalary;
    private double riceSubsidy;
    private double phoneAllowance;
    private double clothesAllowance;

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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary > 0) {
            this.basicSalary = basicSalary;
        }
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate > 0) {
            this.hourlyRate = hourlyRate;
        }
    }

    public boolean isAdmin() {
        return position.contains("Manager")
                || position.contains("Chief")
                || position.contains("Head");
    }

}
