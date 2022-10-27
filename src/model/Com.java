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
public class Com {
    
    private ArrayList<House> houseList;
    private ArrayList<Hosp> hospitalList;
    private String comName;

    public void setComName(String comName) {
        this.comName = comName;
    }
    
    public Com(){}
    
    public Com(String comName){
        this.houseList = new ArrayList<>();
        this.hospitalList = new ArrayList<>();
        this.comName = comName;
    }
    
     public ArrayList<House> getHouseList() {
        return houseList;
    }
    
    public House findPersonInCommunity(Person person){
    
        for(House house:this.getHouseList())
        
            if(house.getFamiliyMembers().contains(person))
                return house;
    
         return null;
    }
    
    public ArrayList<Doc> findDoctorInCommunity(Doc doctor){
    
        for(Hosp hospital:this.getHospitalList())
        
            return hospital.getDoctorHosp();

         return null;
    }
    
    
    public House createHouse(int houseNum,String streetName,String community,String city){
        
        House newHouse = new House( houseNum,  streetName,
                  community, city);
        this.getHouseList().add(newHouse);
        return newHouse;
        
    }
    
    public Hosp createHospital(int hospNum,String streetName, String community,String city){
        
        Hosp newHospital = new Hosp( hospNum, streetName,community, city);
        this.getHospitalList().add(newHospital);
        return newHospital;
        
    }

    public String getComName() {
        return comName;
    }

    public ArrayList<Hosp> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hosp> hospitalList) {
        this.hospitalList = hospitalList;
    }

    
    
    @Override
    public String toString() {
        return comName;
    }
    
     
}
