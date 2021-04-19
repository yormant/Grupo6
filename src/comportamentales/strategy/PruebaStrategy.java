/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.strategy;

/**
 *
 * @author jvelez
 */
public class PruebaStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal nico = new Perro();
        Animal paca = new Ave();
        
        System.out.println("Perro "+nico.trataDeVolar());
        System.out.println("Ave "+paca.trataDeVolar());
        
        //Permite cambios dinamicos en el estado de un obj
        
        nico.setHabilidadVolar(new PuedeVolar());
        System.out.println("Perro: "+nico.trataDeVolar());
    }
    
}
