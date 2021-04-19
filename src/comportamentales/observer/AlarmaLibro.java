/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.observer;

import java.util.ArrayList;

/**
 *
 * @author jvelez
 */
public class AlarmaLibro implements Subject{

    private static ArrayList<ILibroMalEstado> observadores = new ArrayList<>();

    @Override
    public void adjuntar(ILibroMalEstado observer) {
        observadores.add(observer);
    }

    @Override
    public void desadjuntar(ILibroMalEstado observer) {
        observadores.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (int i = 0; i < observadores.size(); i++) {
            observadores.get(i).update();
        }
    }  
}
