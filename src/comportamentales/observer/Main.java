/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.observer;

/**
 *
 * @author jvelez
 */
public class Main {
    public static void main(String[] args) {
        AlarmaLibro alarma = new AlarmaLibro();
        alarma.adjuntar(new Compras());
        alarma.adjuntar(new Administracion());
        alarma.adjuntar(new Stock());
        
        Libro libro = new Libro();
        libro.setEstado("MALO");
        
        Biblioteca biblioteca =new Biblioteca();
        biblioteca.devolverLibro(libro);
    }
}
