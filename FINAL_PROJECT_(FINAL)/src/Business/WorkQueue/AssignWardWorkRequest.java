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
public class AssignWardWorkRequest extends WorkRequest {
   private String Analysis;
   private  String Comments;
   private String name;
   private String age;
   private String sex;
   private String username;
   private int isolationWard;
   private int normalWard;
   private int icuWard;
   private String wardAssigned = "No";
   private String wardType;
   private String traced = "No";

    public String getAnalysis() {
        return Analysis;
    }

    public void setAnalysis(String Analysis) {
        this.Analysis = Analysis;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getIsolationWard() {
        return isolationWard;
    }

    public void setIsolationWard(int isolationWard) {
        this.isolationWard = isolationWard;
    }
    
    public void updateIsolationWard() {
        this.isolationWard = isolationWard-1;
    }

    public int getNormalWard() {
        return normalWard;
    }

    public void setNormalWard(int normalWard) {
        this.normalWard = normalWard;
    }
    
    public void updateNormalWard() {
        this.normalWard = normalWard-1;
    }

    public int getIcuWard() {
        return icuWard;
    }

    public void setIcuWard(int icuWard) {
        this.icuWard = icuWard;
    }
    
    public void updateIcuWard() {
        this.icuWard = icuWard-1;
    }

    public String getWardAssigned() {
        return wardAssigned;
    }

    public void setWardAssigned(String wardAssigned) {
        this.wardAssigned = wardAssigned;
    }

    public String getWardType() {
        return wardType;
    }

    public void setWardType(String wardType) {
        this.wardType = wardType;
    }

    public String getTraced() {
        return traced;
    }

    public void setTraced(String traced) {
        this.traced = traced;
    }
    
    
}
