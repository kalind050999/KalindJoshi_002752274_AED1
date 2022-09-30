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
public class emprechis {
    private ArrayList<emprec> his;
    
    public emprechis()
    {
    this.his = new ArrayList<emprec>();
    
    }

    public ArrayList<emprec> getHis() {
        return his;
    }

    public void setHis(ArrayList<emprec> his) {
        this.his = his;
    }
    
    public emprec addNew()
    {
    emprec newrec = new emprec();
    his.add(newrec);
    return newrec;
    } 
    
}
