/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jvelez
 */
public class BalanceadorCargas {
    private static BalanceadorCargas instancia;
    private final ArrayList<String> servidores = new ArrayList<>();
    private final Random rnd = new Random();
    
    private BalanceadorCargas() {
        servidores.add("Servidor I");
        servidores.add("Servidor II");
        servidores.add("Servidor III");
        servidores.add("Servidor IV");
        servidores.add("Servidor V");
    }
    
    public static BalanceadorCargas getBalanceadorCargas(){
        if(instancia == null){
            instancia = new BalanceadorCargas();
        }
        return instancia;
    }
    
    public String getServidor(){
        int r = rnd.nextInt(servidores.size());
        return servidores.get(r);
    }
}
