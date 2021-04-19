/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.mediator;

import java.util.HashMap;

/**
 *
 * @author jvelez
 */
public class SalonChat implements ISalonChat {

    private HashMap<String, Usuario> participantes = new HashMap<>();

    @Override
    public void registra(Usuario participante) {
        participantes.put(participante.getNombre(), participante);
    }

    @Override
    public void envia(String de, String para, String msg) {
        if(participantes.containsKey(de) && participantes.containsKey(para)){
            Usuario u = participantes.get(para);
            u.recibe(de, msg);
        }
        else{
            System.out.println("Usuario No Existe");
        }
    }

}
