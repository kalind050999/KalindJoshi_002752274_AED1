/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kalindjoshi
 * 
 */
public class Hosp {
    private int hospNum;
    private String streetName;
    private String com;
    private String city;
    private long pin;
    ArrayList<Doc> doctorHosp;
    
    public Hosp(){}
    
    public Hosp (int hospNum,String streetName, String com,String city){
        this.hospNum = hospNum;      
        this.streetName = streetName;
        this.com = com;
        this.city = city;      
        this.doctorHosp=new ArrayList<Doc>();
    }
    
    public void addDoctorToHospital(Doc doctor){
        
        this.getDoctorHosp().add(doctor);
    }

    public int getHospNum() {
        return hospNum;
    }

    public void setHospNum(int hospNum) {
        this.hospNum = hospNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPin() {
        return pin;
    }

    public void setPin(long pin) {
        this.pin = pin;
    }

    public ArrayList<Doc> getDoctorHosp() {
        return doctorHosp;
    }

    public void setDoctorHosp(ArrayList<Doc> doctorHosp) {
        this.doctorHosp = doctorHosp;
    }
    
    
}
