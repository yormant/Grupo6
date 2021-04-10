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
public class Main {
    public static void main(String[] args) {
        ContinenteFactory africa = new AfricaFactory();
        ReinoAnimal reino = new ReinoAnimal(africa);
        reino.cadenaAlimenticia();
        
        ContinenteFactory america = new AmericaFactory();
        reino = new ReinoAnimal(america);
        reino.cadenaAlimenticia();
    }
}
