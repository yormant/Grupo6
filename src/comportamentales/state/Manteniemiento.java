/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.state;

/**
 *
 * @author jvelez
 */
public class Manteniemiento implements Estado{

    @Override
    public void ejecutarAccion() {
        System.out.println("Estado en mantenimiento: No Atento");
        System.out.println("enviar correo para informar el estado");
    }
    
}
