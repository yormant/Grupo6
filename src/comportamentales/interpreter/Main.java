/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.interpreter;

import java.util.ArrayList;

/**
 *
 * @author jvelez
 */
public class Main {
    public static void main(String[] args) {
        String numeroRomano= "LXIX";
        Context context = new Context(numeroRomano);
        ArrayList<Expresion> arbol = new ArrayList<>();
        arbol.add(new ExpresionMil());
        arbol.add(new ExpresionCien());
        arbol.add(new ExpresionDiez());
        arbol.add(new ExpresionUno());
        for (Expresion exp : arbol) {
            exp.interpretar(context);
        }
        System.out.println(context.salida);
    }
   
}
