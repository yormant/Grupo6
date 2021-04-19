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
public class Perro extends Animal{
    public Perro(){
        super();
        setSonido("Ladrar");
        tipoVolar= new NoPuedeVolar();
    }
    public void escarbar(){
        System.out.println("Estoy cavando un hoyo");
    }
//    public void volar(){
//        System.out.println("No puedo volar");
//    }
}
