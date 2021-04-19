/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.chainofresp;

/**
 *
 * @author jvelez
 */
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.solicitarPrestamo(1000000);
    }
}
