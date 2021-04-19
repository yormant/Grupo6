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
public class Socio extends Persona{
    private int numeroSocio;

    public Socio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    @Override
    public String getTipoID() {
        return "Numero de Socio";
    }

    @Override
    public String getIdentificacion() {
        return String.valueOf(numeroSocio);
    }
    
}
