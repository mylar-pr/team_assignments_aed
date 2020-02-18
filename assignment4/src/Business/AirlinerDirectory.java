/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author prajw
 */
public class AirlinerDirectory {
    
    private ArrayList<Airliner> airlinerDir;
    

    public ArrayList<Airliner> getAirlinerDir() {
        return airlinerDir;
    }

    public void setAirlinerDir(ArrayList<Airliner> airlinerDir) {
        this.airlinerDir = airlinerDir;
    }
    
    public Airliner addAirliner(){
        Airliner air_liner = new Airliner();
        airlinerDir.add(air_liner);
        
        return air_liner;
    }
    
    public void deleteAirliner(Airliner air_liner){
        airlinerDir.remove(air_liner);
    }
    
    public Airliner searchAirliner(String airLinerName){
        for(Airliner air_liner: airlinerDir){
            if(airLinerName.equalsIgnoreCase(air_liner.getAirlinerName())){
                return air_liner;
            }
            
        }
        return null;
    }
}
