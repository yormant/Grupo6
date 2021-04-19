/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.visitor;

/**
 *
 * @author jvelez
 */
public class Main {
    public static void main(String[] args) {
        ProductoDescuento p1 = new ProductoDescuento();
        p1.setPrecio(100);
        ProductoNormal p2 = new ProductoNormal();
        p2.setPrecio(100);
        
        IVA iva = new IVA();
        double resultado1 = p1.accept(iva);
        double resultado2 = p2.accept(iva);
        
        System.out.println("Resultado para Producto 1 "+resultado1);
        System.out.println("Resultado para Producto 2 "+resultado2);
    }
 
}
