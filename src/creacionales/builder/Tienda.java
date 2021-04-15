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
public class Tienda {
    public void construir(VehiculoBuilder vehiculoBuilder){
        vehiculoBuilder.construirChasis();
        vehiculoBuilder.construirMotor();
        vehiculoBuilder.construirRuedas();
        vehiculoBuilder.construirPuertas();
    }
}
