/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.command;

import java.util.Scanner;

/**
 *
 * @author jvelez
 */
public class Main {
    public static void main(String[] args) {
        LuzReceiver luz =new LuzReceiver();
        Command swicheArriba = new ComandoMoverArriba(luz);
        Command swicheAbajo = new ComandoMoverAbajo(luz);
        SwicheInvoker swiche = new SwicheInvoker(swicheArriba, swicheAbajo);
        Scanner e = new Scanner(System.in);
        int op=0;
        while(op!=3){
            System.out.println("Operaciones sobre la luz:");
            System.out.println("1.Encender");
            System.out.println("2.Apagar");
            System.out.println("3.Salir");
            op=e.nextInt();
            switch(op){
                case 1: swiche.moverArriba(); break;
                case 2: swiche.moverAbajo(); break;
            }
        }
    }
}
