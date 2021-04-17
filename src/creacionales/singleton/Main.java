/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.singleton;

/**
 *
 * @author jvelez
 */
public class Main {
    public static void main(String[] args) {
        
        BalanceadorCargas b1 = BalanceadorCargas.getBalanceadorCargas();
        BalanceadorCargas b2 = BalanceadorCargas.getBalanceadorCargas();
        BalanceadorCargas b3 = BalanceadorCargas.getBalanceadorCargas();
        BalanceadorCargas b4 = BalanceadorCargas.getBalanceadorCargas();
        
        System.out.println("Esto es un ejemplo de Singleton OK");
        

        if (b1 == b2 && b2 == b3 && b3 == b4) {
            System.out.println("Son la misma instancia");
        } else {
            System.out.println("No son la misma instancia");
        }

        BalanceadorCargas balanceador=BalanceadorCargas.getBalanceadorCargas();
        for (int i = 0; i < 15; i++) {
            String servidor = balanceador.getServidor();
            System.out.println("Atendiendo solicitud para el servidor :" 
                    + servidor);
        }
    }
}
