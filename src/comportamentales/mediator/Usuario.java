/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.mediator;

/**
 *
 * @author jvelez
 */
public class Usuario implements IUsuarioChat{

    private String nombre;
    private SalonChat salon;

    public Usuario(SalonChat salon) {
        this.salon = salon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SalonChat getSalon() {
        return salon;
    }

    public void setSalon(SalonChat salon) {
        this.salon = salon;
    }
    
    
    @Override
    public void envia(String para, String msg) {
        salon.envia(nombre,para,msg);
    }

    @Override
    public void recibe(String de, String msg) {
        String salida = "el usuario "+de+" dice: "+msg;
        System.out.println(nombre+": "+salida);
    }
    
}
