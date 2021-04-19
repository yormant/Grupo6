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
public class SwicheInvoker {
    private Command comandoMoverArriba;
    private Command comandoMoverAbajo;

    public SwicheInvoker(Command comandoMoverArriba, Command comandoMoverAbajo) {
        this.comandoMoverArriba = comandoMoverArriba;
        this.comandoMoverAbajo = comandoMoverAbajo;
    }

   public void moverArriba(){
       comandoMoverArriba.execute();
   }
   
   public void moverAbajo(){
       comandoMoverAbajo.execute();
   }
    
    
}
