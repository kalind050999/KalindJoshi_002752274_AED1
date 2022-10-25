/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author kalindjoshi
 */
public class PersonDir {
    ArrayList<Person> personList;
    
    public PersonDir(){
        
        personList = new ArrayList<Person>();
//        this.syst = syst;   
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public void addPersonToDirectory(Person person){
        personList.add(person);
    }
           
    public Person createPerson(long mob, String name, LocalDate dob, String com){
        
        //Create person
        Person newPerson = new  Person(mob, name,dob, com);
        
        //Add created person to a list
        personList.add(newPerson);
        return newPerson;

    }
    
}
