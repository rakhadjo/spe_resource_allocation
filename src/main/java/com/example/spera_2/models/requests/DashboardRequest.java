/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spera_2.models.requests;

import org.bson.Document;

/**
 *
 * @author rakhadjo
 */
public class DashboardRequest {
    
    private String year;
    private String device_id;
    
    public DashboardRequest() {}
    public DashboardRequest(String device_id, String year) {
        this.year = year;
        this.device_id = device_id;
    }
    
    public boolean yearVerifiable() {
        try {
            
            return  Integer.parseInt(year) > 1970 && 
                    Integer.parseInt(year) < 2100 && 
                    year.length() == 4;
            
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public String getYear() { return year; }
    public void setYear(String year) { this.year = year; }
    
    public String getDevice_id() { return device_id; }
    public void setDevice_id(String device_id) { this.device_id = device_id; }
    
    public Document toDocument() {
        return new Document()
                .append("year", year)
                .append("device_id", device_id)
                ;
    }
}
