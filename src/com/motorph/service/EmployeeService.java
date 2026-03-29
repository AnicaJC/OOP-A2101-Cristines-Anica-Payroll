/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author AJ
 */
package com.motorph.service;

import com.motorph.model.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private final String CSV_PATH = "MotorPH_Employee Data - Employee Details.csv";

    public List<Employee> getAllEmployees() throws IOException {
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(CSV_PATH))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                double basicSalary = parseAmount(data, 11);
                double rice = parseAmount(data, 12);
                double phone = parseAmount(data, 13);
                double clothes = parseAmount(data, 14);
                double hourlyRate = parseAmount(data, 16);
                
                if (data.length >= 17) {

                    Employee emp = new Employee(
                            data[0].replace("\"", ""), // 1. ID
                            data[1].replace("\"", ""), // 2. Last Name
                            data[2].replace("\"", ""), // 3. First Name
                            data[3].replace("\"", ""), // 4. Birthday
                            data[4].replace("\"", ""), // 5. Address
                            data[5].replace("\"", ""), // 6. Phone
                            data[10].replace("\"", ""),// 7. Position
                            basicSalary, // 8. Basic Salary
                            data[6].replace("\"", ""), // 9. SSS #
                            data[7].replace("\"", ""), // 10. PhilHealth #
                            data[8].replace("\"", ""), // 11. TIN
                            data[9].replace("\"", ""), // 12. Pag-ibig #
                            hourlyRate, // 13. Hourly Rate
                            rice, // 14. Rice Subsidy
                            phone, // 15. Phone Allowance
                            clothes
                    );
                    employees.add(emp);
                }
            }
        }
        return employees;
    }

    public Employee findEmployeeById(String id) throws IOException {
        for (Employee emp : getAllEmployees()) {
            if (emp.getId().trim().equals(id.trim())) {
                return emp;
            }
        }
        return null;
    }

    private double parseAmount(String[] data, int index) {
        if (index >= data.length || data[index] == null || data[index].trim().isEmpty()) {
            return 0.0;
        }
        try {
            return Double.parseDouble(data[index].replace("\"", "").replace(",", "").trim());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
