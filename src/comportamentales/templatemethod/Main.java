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
public class Main {
    public static void main(String[] args) {
        Persona p = new Cliente(12345);
        System.out.println("El cliente se identifica: "+p.indentificarse());
        
        p = new Empleado("Carpeta del Expediente Número 9876");
        System.out.println("El empleado se identifica: "+p.indentificarse());
        
        p = new Socio(87654);
        System.out.println("El socio se identifica: "+p.indentificarse());
    }
}
