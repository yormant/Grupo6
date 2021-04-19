/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.observer;

/**
 *
 * @author jvelez
 */
public class Biblioteca {
    public void devolverLibro(Libro libro){
        if(libro.getEstado().equals("MALO")){
            System.out.println("esta malo");
            AlarmaLibro alarma = new AlarmaLibro();
            alarma.notificarObservers();
        }
    }
}
