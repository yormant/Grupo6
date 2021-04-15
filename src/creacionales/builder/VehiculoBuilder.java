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
public abstract class VehiculoBuilder {
    protected Vehiculo vehiculo;
    
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    
    public abstract void construirChasis();
    public abstract void construirMotor();
    public abstract void construirRuedas();
    public abstract void construirPuertas();
   
}
