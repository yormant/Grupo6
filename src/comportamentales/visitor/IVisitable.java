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
public interface IVisitable {
    public double accept(Visitor visitor);
}
