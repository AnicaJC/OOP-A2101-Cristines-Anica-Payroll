/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.model;


/**
 *
 * @author AJ
 */

public class AttendanceRecord {
    private String date;
    private String timeIn;
    private String timeOut;

    public AttendanceRecord(String date, String timeIn, String timeOut) {
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    // Getters
    public String getDate() { return date; }
    public String getTimeIn() { return timeIn; }
    public String getTimeOut() { return timeOut; }
}