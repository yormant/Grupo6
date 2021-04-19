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
public class LiderEquipoEjecutivo implements IAprobador{

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
        if(cantidad>10000 &&cantidad<=50000){
            System.out.println("Lo manejo YO el Lider Del Equipo Ejecutivo");
        }
        else{
            siguiente.solicitarPrestamo(cantidad);
        }
    }
    
}
