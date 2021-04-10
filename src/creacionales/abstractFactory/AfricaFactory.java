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
public class AfricaFactory extends ContinenteFactory{
    public Herbivoro crearHerbivoro(){
        return new Impala();
    }
    public Carnivoro crearCarnivoro(){
        return new Leon();
    }
}
