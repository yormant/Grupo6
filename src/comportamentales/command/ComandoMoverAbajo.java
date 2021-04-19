/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.command;

/**
 *
 * @author jvelez
 */
public class ComandoMoverAbajo implements Command{

    private LuzReceiver luz;

    public ComandoMoverAbajo(LuzReceiver luz) {
        this.luz = luz;
    }
    
    @Override
    public void execute() {
        luz.apagar();
    }
    
}
