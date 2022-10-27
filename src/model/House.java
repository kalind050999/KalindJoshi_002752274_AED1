/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kalindjoshi
 */
public class House {
    
    private int houseNum;
    private String unitNum;
    private String streetName;
    private String com;
    private String city;
    private long pin;
    ArrayList<Person> familiyMembers;
    
    public House(int houseNum,String streetName,
                 String com,String city
                    ){
        
        this.houseNum = houseNum;      
        this.streetName = streetName;
        this.com = com;
        this.city = city;      
        this.familiyMembers=new ArrayList<Person>();
        
    }

    public int getHouseNum() {
        return houseNum;
    }

    

    public String getStreetName() {
        return streetName;
    }

    public String getCommunity() {
        return com;
    }

    public String getCity() {
        return city;
    }

 
    public ArrayList<Person> getFamiliyMembers() {
        return familiyMembers;
    }
    
    public void addPersonToHouse(Person member){
        
        this.getFamiliyMembers().add(member);
    
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public void setUnitNum(String unitNum) {
        this.unitNum = unitNum;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPin(long pin) {
        this.pin = pin;
    }

    public void setFamiliyMembers(ArrayList<Person> familiyMembers) {
        this.familiyMembers = familiyMembers;
    }
    
    
    
 
    
}
