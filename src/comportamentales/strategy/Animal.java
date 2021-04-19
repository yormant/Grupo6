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
public class Animal {
    private String nombre;
    private int edad;
    private double velocidad;
    private String sonido;
    protected IVolar tipoVolar;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 0){
            this.edad = edad;
        }else{
            System.out.println("Error!! La edad debe ser positiva");
        }
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        if(velocidad > 0){
            this.velocidad = velocidad;
        }else{
            System.out.println("Error!! La velocidad debe ser positiva");
        }
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
    
    public String trataDeVolar(){
        return tipoVolar.volar();
    }
    
    public void setHabilidadVolar(IVolar tipo){
        tipoVolar=tipo;
    }
//    public void volar(){
//        System.out.println("Estoy volando");
//    }
}
