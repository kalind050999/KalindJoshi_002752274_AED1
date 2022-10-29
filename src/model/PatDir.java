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
public class PatDir {
     ArrayList<Pat> patList;
     
     public PatDir(){
        
        patList = new ArrayList<Pat>();
//        this.syst = syst;   
    }
     
     public Pat getPatById(int id){
        
       for(Pat p: patList){
            
            if(p.matchByPid(id)){
                return p;
            }
            
            //Patient not found
            
        }
        return null;
        
    }
    
    public Pat createPat(Person person){
        
        //Create person
        Pat newPat = new Pat(person);
        
        //Add created person to a list
        patList.add(newPat);
        
        return newPat;
        
    }
    
    public Pat searchPatientByName(String name){
        
        for(Pat p: patList){
            
            if(p.matchByName(name)){
                return p;
            }
            
            //Patient not found
            
        }
        return null;
    }
    
    public ArrayList<Pat> getPatList() {
        return patList;
    }
    
}
