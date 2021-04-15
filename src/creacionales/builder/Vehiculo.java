/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.builder;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jvelez
 */
public class Vehiculo {
    private String tipoVehiculo;
    private Map<String,String> partes = new HashMap<String, String>();

    public Vehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getParte(String clave){
        return partes.get(clave);
    }
    
    public void setParte(String clave, String valor){
        partes.put(clave, valor);
    }
    
    public void mostrar(){
        System.out.println("\n--------------------");
        System.out.println("Tipo de Vehiculo "+tipoVehiculo);
        System.out.println("Chasis : "+partes.get("Chasis"));
        System.out.println("Motor  : "+partes.get("Motor"));
        System.out.println("Ruedas : "+partes.get("Ruedas"));
        System.out.println("Puertas: "+partes.get("Puertas"));
    }
}
