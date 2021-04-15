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
public class MotoBuilder extends VehiculoBuilder{

    public MotoBuilder() {
        vehiculo = new Vehiculo("Moto");
    }
    
    @Override
    public void construirChasis() {
        vehiculo.setParte("Chasis", "Chasis de la moto");
    }

    @Override
    public void construirMotor() {
        vehiculo.setParte("Motor", "1500 c.c.");
    }

    @Override
    public void construirRuedas() {
        vehiculo.setParte("Ruedas", "2 de marca KUMHO");
    }

    @Override
    public void construirPuertas() {
        vehiculo.setParte("Puertas", "0 puertas");
    }
}
