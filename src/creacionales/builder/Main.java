/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.builder;

/**
 *
 * @author jvelez
 */
public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        VehiculoBuilder builder;
        
        builder = new CarroBuilder();
        tienda.construir(builder);
        builder.vehiculo.mostrar();
        
        builder = new MotoBuilder();
        tienda.construir(builder);
        builder.vehiculo.mostrar();
    }
}
