/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kalindjoshi
 */
public class VitalSigns {
    
    float bloodPressure;
    float bodyweight;
    float heartBeat;
    String symptoms;
    

    public VitalSigns(float bloodPressure, float heartBeat, float bodyweight, String symptoms) {
        this.bloodPressure = bloodPressure;
        this.heartBeat = heartBeat;
        this.bodyweight = bodyweight;
        this.symptoms = symptoms;
    }

    public float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public float getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(float heartBeat) {
        this.heartBeat = heartBeat;
    }

    public float getBodyWeight() {
        return bodyweight;
    }

    public void setBodyWeight(float bodyweight) {
        this.bodyweight = bodyweight;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
    
 }
