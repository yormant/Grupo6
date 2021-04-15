/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creacionales.factoryMethod;


public abstract class Plan {
    double tasa;
    
    abstract void getTasa();
    
    public void calcularCuenta(int unidades){
        System.out.println(unidades * tasa);
    }
}
