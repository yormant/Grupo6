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
class Leon extends Carnivoro {

    public Leon() {
    }

    @Override
    public void come(Herbivoro h) {
        System.out.println(this.getClass().getSimpleName()+" COME "+h.getClass().getSimpleName());
    }
    
}
