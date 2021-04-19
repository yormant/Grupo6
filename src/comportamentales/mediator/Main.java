/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.mediator;

/**
 *
 * @author jvelez
 */
public class Main {
    public static void main(String[] args) {
        SalonChat salon = new SalonChat();
        
        Usuario u = new Usuario(salon);
        u.setNombre("Pedro");
        salon.registra(u);
        
        Usuario u2 = new Usuario(salon);
        u2.setNombre("Juan");
        salon.registra(u2);
        
        Usuario u3 = new Usuario(salon);
        u3.setNombre("Luisa");
        salon.registra(u3);
        
        u.envia("Juan", "Hola Juan");
        u2.envia("Pedro", "Hola Bien Tu?");
        u3.envia("Marco", "Marco estas?");
        
    }
}
