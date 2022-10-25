/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author kalindjoshi
 */
public class Person {
    
    private String name;
    private int age;
    private LocalDate dob;
    private long mob;
    private String com;
    
    public Person(){}
    //Create a person
    public Person(long mob,String name,LocalDate dob, String com){
       
        this.name = name;
        this.mob = mob;
        this.age = calculateAge(dob);
        this.dob = dob;
        this.com = com;       
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setmob(long mob) {
        this.mob = mob;
    }

        
    public int calculateAge(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public long getmob() {
        return mob;
    }

    public boolean matchByName(String name) {
        
        return this.getName().equals(name);
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
