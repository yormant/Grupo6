/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.abstractFactory;

/**
 *
 * @author jvelez
 */
public class ReinoAnimal {
    private Herbivoro herbivoro;
    private Carnivoro carnivoro;
    
    public ReinoAnimal(ContinenteFactory fabrica){
        herbivoro = fabrica.crearHerbivoro();
        carnivoro = fabrica.crearCarnivoro();
    }
    
    public void cadenaAlimenticia(){
        carnivoro.come(herbivoro);
    }
}
