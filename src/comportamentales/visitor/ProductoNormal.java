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
public class ProductoNormal implements IVisitable{
    
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}
