/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.service;

/**
 *
 * @author AJ
 */

public class SalaryCalculator {

    public static double calculateGrossSalary(double hourlyRate, double hoursWorked) {
        return hourlyRate * hoursWorked;
    }

    public static double calculateSSS(double grossSalary) {
        if (grossSalary <= 3250) return 135.00;
        if (grossSalary >= 24750) return 1125.00;
        return grossSalary * 0.045;
    }

    public static double calculatePhilHealth(double grossSalary) {
        double rate = 0.05 / 2;
        double contribution = grossSalary * rate;
        if (grossSalary <= 10000) return 250.00;
        if (grossSalary >= 100000) return 2500.00;
        return contribution;
    }

    public static double calculatePagIBIG(double grossSalary) {
        double contribution = grossSalary * 0.02;
        return Math.min(contribution, 200.00);
    }

    public static double calculateTax(double taxableIncome) {
        if (taxableIncome <= 20833) return 0;
        if (taxableIncome <= 33333) return (taxableIncome - 20833) * 0.15;
        if (taxableIncome <= 66667) return 1875 + (taxableIncome - 33333) * 0.20;
        return 8541.67 + (taxableIncome - 66667) * 0.25;
    }
}
