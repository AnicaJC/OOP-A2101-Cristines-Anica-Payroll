/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.service;

/**
 *
 * @author AJ
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.time.Duration;

public class AttendanceService {

    private static final String FILE_PATH = "MotorPH Employee Data - Attendance Record.csv";

    public static double getTotalHours(String employeeId) {
        long totalMinutes = 0;
        String targetId = employeeId.trim();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");
                if (data.length >= 4) {
                    String fileId = data[0].replace("\"", "").trim();

                    if (fileId.equals(targetId)) {
                        totalMinutes += calculateMinutes(data[2], data[3]);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Attendance file not found: " + e.getMessage());
        }

        return totalMinutes / 60.0;
    }

    private static long calculateMinutes(String timeIn, String timeOut) {
        try {
            String cleanIn = timeIn.replace("\"", "").trim();
            String cleanOut = timeOut.replace("\"", "").trim();

            LocalTime in = LocalTime.parse(cleanIn);
            LocalTime out = LocalTime.parse(cleanOut);
            return Duration.between(in, out).toMinutes();
        } catch (Exception e) {
            return 0;
        }
    }
}
