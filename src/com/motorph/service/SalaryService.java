/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.service;

import com.motorph.model.Employee;

/**
 *
 *
 *
 * @author AJ
 *
 */
public class SalaryService {
    public double calculateWeeklyNet(Employee emp, double hoursWorked) {
        double hourlyRate = emp.getHourlyRate();
        double grossPay = hourlyRate * hoursWorked;
        double sss = calculateSSS(emp.getBasicSalary()) / 4;
        double philhealth = calculatePhilhealth(emp.getBasicSalary()) / 4;
        double pagibig = 100.00 / 4;
        double totalDeductions = sss + philhealth + pagibig;
        double taxableIncome = grossPay - totalDeductions;
        double tax = calculateWithholdingTax(taxableIncome);
        return grossPay - (totalDeductions + tax);
    }

    public double calculateSSS(double basicSalary) {
        if (basicSalary <= 3250) {
            return 135.00;
        }

        if (basicSalary >= 24750) {
            return 1125.00;
        }
        return (basicSalary - 3250) / 500 * 22.5 + 135;
    }

    public double calculatePhilhealth(double basicSalary) {
        double totalContribution = basicSalary * 0.045;
        return totalContribution / 2;
    }

    public double calculateWithholdingTax(double taxableIncome) {
        if (taxableIncome <= 20833) {
            return 0;
        }

        if (taxableIncome <= 33333) {
            return (taxableIncome - 20833) * 0.20;
        }

        if (taxableIncome <= 66667) {
            return 2500 + (taxableIncome - 33333) * 0.25;
        }
        return 10833 + (taxableIncome - 66667) * 0.30;
    }
}
