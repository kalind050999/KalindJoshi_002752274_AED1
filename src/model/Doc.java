/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kalindjoshi
 */
public class Doc {
    private long Did;
    Person person;
    static long count = 0;
    String docPass;
//    EncounterHistory encounterHistory;
    
    public Doc(Person person){   
        count += 1;
        this.Did = count;
        this.person = person;
        this.docPass = (person.getName()).concat("123");
    }

    public String getDocPass() {
        return docPass;
    }

    public void setDocPass(String docPass) {
        this.docPass = docPass;
    }
   

    public long getDid() {
        return Did;
    }

    public void setDid(long Did) {
        this.Did = Did;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        Doc.count = count;
    }
    
    public boolean matchByName(String name){
        
        return this.person.matchByName(name);
    }
    
    public boolean matchByDid(int Did){
        
        return this.getDid() == Did;
    }
    
    
}
