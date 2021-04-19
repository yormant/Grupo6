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
public class ExpresionMil extends Expresion {

    @Override
    public String uno() {
        return "M";
    }

    @Override
    public String cuatro() {
        return " ";
    }

    @Override
    public String cinco() {
        return " ";
    }

    @Override
    public String nueve() {
        return " ";
    }

    @Override
    public int multiplicador() {
        return 1000;
    }
}
