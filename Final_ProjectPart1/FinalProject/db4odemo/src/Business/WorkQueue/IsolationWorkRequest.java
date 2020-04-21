/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author paipr
 */
public class IsolationWorkRequest extends WorkRequest {
    private String Symptom1;
    private String Symptom2;
    private String Symptom3;
    private String Symptom4;
    private String Symptom5;
    private String Symptoms;
    private String comment;
    private String username;
    

    public String getSymptom1() {
        return Symptom1;
    }

    public void setSymptom1(String Symptom1) {
        this.Symptom1 = Symptom1;
    }

    public String getSymptom2() {
        return Symptom2;
    }

    public void setSymptom2(String Symptom2) {
        this.Symptom2 = Symptom2;
    }

    public String getSymptom3() {
        return Symptom3;
    }

    public void setSymptom3(String Symptom3) {
        this.Symptom3 = Symptom3;
    }

    public String getSymptom4() {
        return Symptom4;
    }

    public void setSymptom4(String Symptom4) {
        this.Symptom4 = Symptom4;
    }

    public String getSymptom5() {
        return Symptom5;
    }

    public void setSymptom5(String Symptom5) {
        this.Symptom5 = Symptom5;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSymptoms() {
        return Symptoms;
    }

    public void setSymptoms(String Symptoms) {
        this.Symptoms = Symptoms;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
