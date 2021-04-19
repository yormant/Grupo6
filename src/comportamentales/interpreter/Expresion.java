/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.interpreter;

/**
 *
 * @author jvelez
 */
public abstract class Expresion {

    public abstract String uno();

    public abstract String cuatro();

    public abstract String cinco();

    public abstract String nueve();

    public abstract int multiplicador();

    public void interpretar(Context context) {
        if (context.entrada.startsWith(nueve())) {
            context.salida += (9 * multiplicador());
            context.entrada = context.entrada.substring(2);
        } else if (context.entrada.startsWith(cuatro())) {
            context.salida += (4 * multiplicador());
            context.entrada = context.entrada.substring(2);
        } else if (context.entrada.startsWith(cinco())) {
            context.salida += (5 * multiplicador());
            context.entrada = context.entrada.substring(1);
        }
        while(context.entrada.startsWith(uno())){
            context.salida += (1*multiplicador());
            context.entrada = context.entrada.substring(1);
        }
    }
}
