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
public class HospDir {
    ArrayList<Hosp> hospList;
    
    public HospDir(){
        hospList = new ArrayList<Hosp>();
    }

    
    public Hosp createHosp(int hospNum,String streetName, String community,String city){
        Hosp newHosp = new Hosp(hospNum, streetName, community, city);
        hospList.add(newHosp);
        return newHosp;
    }
    
    public void addHosp(Hosp hosp){
        this.getHospList().add(hosp);
    }
    
    public ArrayList<Hosp> getHospList() {
        return hospList;
    }

    public void setHospitalList(ArrayList<Hosp> hospList) {
        this.hospList = hospList;
    }
    
    
}
