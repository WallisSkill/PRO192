
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Student implements Serializable {
    String ID;
    String name;
    String gender;
    float pt;
    float assignment;
    float workshop;
    float PE;
    float FE;
    float average;
    String status;

    
    public Student(String ID, String name, String gender, float pt, float assignment, float workshop, float PE, float FE, float average, String status) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.pt = pt;
        this.assignment = assignment;
        this.workshop = workshop;
        this.PE = PE;
        this.FE = FE;
        this.average = average;
        this.status = status;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getPt() {
        return pt;
    }

    public void setPt(float pt) {
        this.pt = pt;
    }

    public float getAssignment() {
        return assignment;
    }

    public void setAssignment(float assignment) {
        this.assignment = assignment;
    }

    public float getWorkshop() {
        return workshop;
    }

    public void setWorkshop(float workshop) {
        this.workshop = workshop;
    }

    public float getPE() {
        return PE;
    }

    public void setPE(float PE) {
        this.PE = PE;
    }

    public float getFE() {
        return FE;
    }

    public void setFE(float FE) {
        this.FE = FE;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
  
}
