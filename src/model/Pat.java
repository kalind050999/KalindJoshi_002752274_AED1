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
public class Pat {
    
    private String userPass;
    private long Pid;
    Person person;
    static long flag = 0;
    EncounterHis encounterHistory;
    public Pat(){}
    
    public Pat(Person person){   
        flag += 1;
        this.Pid = flag;
        this.person = person;
        this.userPass = (person.getName()).concat("123");
        //Create patient specific encounter history 
        this.encounterHistory = new EncounterHis();
        
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
    
    public EncounterHis createEncounterHistory(){
        
        return new EncounterHis(this);
    }

    public EncounterHis getEncounterHistory() {
        return encounterHistory;
    }
    
    public ArrayList<Encounter> getPatEncounterHistory(){
        
        return this.encounterHistory.getEncounterList();
        
    }
    
    public long getPid() {
        return Pid;
    }
    
    public boolean matchByName(String name){
        
        return this.person.matchByName(name);
    }
    
    public boolean matchByPid(int Pid){
        
        return this.getPid() == Pid;
    }
    
    public Person getPerson() {
        return person;
    }
    
    public boolean matchByContact(long contact){
        return this.person.getmob() == contact;
    }
}
