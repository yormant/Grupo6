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
public class Persona {
    private String nombre;
    public Memento guardarEnMemento(){
        System.out.println("Guardando memento");
        return new Memento(nombre);
    }
    public void restaurarDeMemento(Memento m){
        nombre = m.getEstadoGuardado();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
