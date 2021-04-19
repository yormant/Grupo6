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
public class Empleado extends Persona{
    private String expediente;

    public Empleado(String expediente) {
        this.expediente = expediente;
    }

    public String getExpediente() {
        return expediente;
    }

    @Override
    public String getTipoID() {
        return "Expediente del Empleado";
    }

    @Override
    public String getIdentificacion() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }
}
