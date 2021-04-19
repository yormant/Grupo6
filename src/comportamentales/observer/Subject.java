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
public interface Subject {
    public void adjuntar(ILibroMalEstado observer);
    public void desadjuntar(ILibroMalEstado observer);
    public void notificarObservers();
}
