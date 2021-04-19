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
public interface IAprobador {
    public void setSiguiente(IAprobador aprobador);
    public IAprobador getSiguiente();
    public void solicitarPrestamo(int cantidad);
}
