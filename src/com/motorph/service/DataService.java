/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.service;

/**
 *
 * @author AJ
 */
import com.motorph.model.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataService {

    private static final String FILE_PATH = "MotorPH_Employee Data - Employee Details.csv";

    public static List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line = br.readLine();

            while ((line = br.readLine()) != null) {
                System.out.println("Found line: " + line);
                String[] data = line.split(",", -1);

                if (data.length >= 16) {
                    String id = data[0];
                    String lastName = data[1];
                    String firstName = data[2];
                    String fullName = firstName + " " + lastName;
                    String birthday = data[3];
                    String address = data[4];
                    String phone = data[5];
                    String sss = data[6];
                    String philhealth = data[7];
                    String tin = data[8];
                    String pagibig = data[9];
                    String position = data[10];
                    
                    double basicSalary = parseDouble(data[11]);
                    double hourlyRate = parseDouble(data[12]);
                    double riceSubsidy = parseDouble(data[13]);
                    double phoneAllowance = parseDouble(data[14]);
                    double clothesAllowance = parseDouble(data[15]);

                    Employee emp = new Employee(
                            id, lastName, firstName, fullName, birthday, address, phone,
                            basicSalary, sss, philhealth, tin, pagibig, hourlyRate,
                            riceSubsidy, phoneAllowance, clothesAllowance);
                    list.add(emp);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading employees: " + e.getMessage());
        }
        return list;
    }

    private static double parseDouble(String value) {
        try {
            return (value == null || value.trim().isEmpty()) ? 0.0 : Double.parseDouble(value.trim());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
