/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creacionales.prototype;


public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado(1,"Amanda Ortiz",
                "Médico General","Calle 5 Nro 235",6000000);
        empleado.mostrarEmpleado();
        Empleado clon = (Empleado) empleado.clonar();
        clon.mostrarEmpleado();
    }
}
