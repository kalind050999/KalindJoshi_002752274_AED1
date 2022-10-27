/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author kalindjoshi
 */
public class Encounter {
    VitalSigns vitals;
    private LocalDate lastVisitDate;
    private long eid;
    static long flag = 0;

    public Encounter(VitalSigns vitals) {
        this.lastVisitDate = LocalDate.now();
        this.vitals = vitals;
        flag = flag + 1;
        this.eid = flag;    
    }

    public VitalSigns getVitals() {
        return vitals;
    }

    public void setVital(VitalSigns vitals) {
        this.vitals = vitals;
    }

    public LocalDate getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(LocalDate lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public long getEid() {
        return eid;
    }

    public void setEid(long eid) {
        this.eid = eid;
    }

    public static long getFlag() {
        return flag;
    }

    public static void setFlag(long flag) {
        Encounter.flag = flag;
    }
    
    
}
