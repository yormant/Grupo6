/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.strategy;

/**
 *
 * @author jvelez
 */
public class NoPuedeVolar implements IVolar{

    @Override
    public String volar() {
        return "Soy un animal que no puede volar";
    }
    
}
