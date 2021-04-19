/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.templatemethod;

/**
 *
 * @author jvelez
 */
public abstract class Persona {
    private String nombre; 
    private String Id;
    
    public String indentificarse(){
        return "Me identifico con: "+ getTipoID()+" Número: "+getIdentificacion();
    }
    public abstract String getTipoID();
    public abstract String getIdentificacion();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    
}
