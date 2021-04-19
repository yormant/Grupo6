/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.state;

import java.util.Scanner;

/**
 *
 * @author jvelez
 */
public class PruebaState {
    
    public static void muestraMenu(){
        StringBuffer menu = new StringBuffer();
        menu.append("---------------------------------\n");
        menu.append("SELECCIONE EL ESTADO DE LA ALARMA\n");
        menu.append("1. Activa 2.Mantenimiento 0.Salir\n");
        menu.append("---------------------------------\n");
        System.out.println(menu.toString());
    }
    public static void main(String[] args){
        Alarma alarma = new Alarma();
        Activa activa = new Activa();
        Manteniemiento mantenimiento = new Manteniemiento();
        int opcion;
        Scanner entradaDatos = new Scanner(System.in);
        do{
            muestraMenu();
            opcion=entradaDatos.nextInt();
            switch(opcion){
                case 1: alarma.setEstado(activa);
                        break;
                case 2: alarma.setEstado(mantenimiento);
                        break;
                case 0: System.exit(0);
                default: System.out.println("Error. opción no válida");
                         break;
            }
            alarma.ejecutarAccion();
        }while(opcion != 0);
    }
}
