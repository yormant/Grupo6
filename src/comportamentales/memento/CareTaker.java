/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.memento;

import java.util.ArrayList;

/**
 *
 * @author jvelez
 */
public class CareTaker {
    private ArrayList<Memento> estados = new ArrayList<>();
    public void agregarMemento(Memento m){
        estados.add(m);
    }
    public Memento getMemento(int i){
        return estados.get(i);
    }
}
