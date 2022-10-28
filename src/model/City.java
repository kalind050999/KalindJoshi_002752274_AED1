/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kalindjoshi
 */
public class City {
    String cityName;
    ArrayList<Com> comList;
    
    public City(String cityName){
        this.comList = new ArrayList<Com>();
        this.cityName = cityName;
    }
    
    public Com newCommunity(String comName){
        Com com = new Com(comName);
        this.comList.add(com);
        return com;
    }

    public Com getCommByObject(Com comName){
        
        for(Com com: this.getComList()){
            
            if(com.getComName().equals(comName)){
                return com;
            }
        }
        
        return null;
    }
    
    public boolean CommunityExists(String commName){
        
        for(Com comm: this.getComList()){
            
            if(comm.getComName().equals(commName)){
                return true;
            }
        }
        
        return false;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Com> getComList() {
        return comList;
    }

    public void setComList(ArrayList<Com> commList) {
        this.comList = commList;
    }

    @Override
    public String toString() {
        return cityName;
    }
    
    
    
    
}
