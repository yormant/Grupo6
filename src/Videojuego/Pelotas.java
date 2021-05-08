/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Videojuego;

import java.awt.*;

/**
 *
 * @author amartinez
 */
public class Pelotas {
  private int x;
    private int y;
    private PelotasType type;

    public Pelotas(int x, int y, PelotasType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }  
}
