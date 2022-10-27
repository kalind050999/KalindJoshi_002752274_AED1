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
public class DocDir {
    ArrayList<Doc> docList;

    public DocDir() {
        docList = new ArrayList<Doc>();
    }
    
    public void addDoc(Doc doc){
        docList.add(doc);
    }
    
    public Doc createDoctor(Person person){
        Doc newDoc = new Doc(person);
        docList.add(newDoc);
        return newDoc;
    }

    public ArrayList<Doc> getDocList() {
        return docList;
    }

    public void setDocList(ArrayList<Doc> docList) {
        this.docList = docList;
    }
    
    
}
