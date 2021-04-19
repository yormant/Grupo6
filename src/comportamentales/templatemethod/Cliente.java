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
public class Cliente extends Persona {

    private int numeroCliente;

    public Cliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    @Override
    public String getTipoID() {
        return "Numero de Cliente";
    }

    @Override
    public String getIdentificacion() {
        return String.valueOf(numeroCliente);
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
}
