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
public class IVA implements Visitor{

    private final double impuestoNormal = 0.19;
    private final double impuestoDescuento = 0.1;
    
    @Override
    public double visit(ProductoNormal normal) {
        return normal.getPrecio()*impuestoNormal;
    }

    @Override
    public double visit(ProductoDescuento descuento) {
        return descuento.getPrecio()*impuestoDescuento;
    }
    
}
