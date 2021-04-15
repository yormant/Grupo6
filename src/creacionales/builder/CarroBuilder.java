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
public class CarroBuilder extends VehiculoBuilder{

    public CarroBuilder() {
        vehiculo = new Vehiculo("Carro");
    }

    
    @Override
    public void construirChasis() {
        vehiculo.setParte("Chasis", "Chasis del Carro");
    }

    @Override
    public void construirMotor() {
        vehiculo.setParte("Motor", "3400 c.c.");
    }

    @Override
    public void construirRuedas() {
        vehiculo.setParte("Ruedas", "4 ruedas marca TOYO");
    }

    @Override
    public void construirPuertas() {
        vehiculo.setParte("Puertas", "4 puertas con elevavidrios eléctricos");
    }
    
}
