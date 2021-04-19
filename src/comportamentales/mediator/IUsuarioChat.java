/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales.mediator;

/**
 *
 * @author jvelez
 */
public interface IUsuarioChat {
    public void envia(String para, String msg);
    public void recibe(String de, String msg);
}
