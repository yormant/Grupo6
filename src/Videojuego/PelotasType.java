/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Videojuego;

import estructurales.flyweight.*;
import java.awt.*;

/**
 *
 * @author amartinez
 */
public class PelotasType {
    private String name;
    private Color color;
    private String otherBallData;

    public PelotasType(String name, Color color, String otherBallData) {
        this.name = name;
        this.color = color;
        this.otherBallData = otherBallData;
    }

    public void draw(Graphics g, int x, int y) {
        //g.setColor(Color.BLACK);
        //g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
