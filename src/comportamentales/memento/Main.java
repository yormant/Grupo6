/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.memento;

/**
 *
 * @author jvelez
 */
public class Main {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Persona p =new Persona();
        p.setNombre("juan");
        p.setNombre("Carlos");
        careTaker.agregarMemento(p.guardarEnMemento());
        
        p.setNombre("Felipe");
        careTaker.agregarMemento(p.guardarEnMemento());
        
        p.setNombre("Diego");
        careTaker.agregarMemento(p.guardarEnMemento());
        
        Memento m = careTaker.getMemento(0);
        Memento m2 = careTaker.getMemento(1);
        
        System.out.println(m.getEstadoGuardado());
        System.out.println(m2.getEstadoGuardado());
        
        
        
    }
}
