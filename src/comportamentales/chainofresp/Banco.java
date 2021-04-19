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
public class Banco implements IAprobador{
    IAprobador siguiente;
    @Override
    public void setSiguiente(IAprobador aprobador) {
        siguiente=aprobador;
    }

    @Override
    public IAprobador getSiguiente() {
        return siguiente;
    }

    @Override
    public void solicitarPrestamo(int cantidad) {
        EjecutivoCuenta ejecutivoCuenta = new EjecutivoCuenta();
        this.setSiguiente(ejecutivoCuenta);
        
        LiderEquipoEjecutivo liderEquipoEjecutivo = new LiderEquipoEjecutivo();
        ejecutivoCuenta.setSiguiente(liderEquipoEjecutivo);
        
        Gerente gerente = new Gerente();
        liderEquipoEjecutivo.setSiguiente(gerente);
        
        Director director = new Director();
        gerente.setSiguiente(director);
        
        siguiente.solicitarPrestamo(cantidad);
    }
}
