/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creacionales.factoryMethod;


public class FabricaPlanes {

    public Plan getPlan(String tipoPlan){
        if(tipoPlan == null){
            return null;            
        }
        else if(tipoPlan.equalsIgnoreCase("DOMESTICO")){
            return new PlanDomestico();
        }
        else if(tipoPlan.equalsIgnoreCase("COMERCIAL")){
            return new PlanComercial();
        }
        else if(tipoPlan.equalsIgnoreCase("INSTITUCIONAL")){
            return new PlanInstitucional();
        }
        return null;
    }
}
