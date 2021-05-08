/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Videojuego;


import estructurales.flyweight.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amartinez
 */
public class VideoJuego extends JFrame{
    private List<Pelotas> balls = new ArrayList<>();

    public void pintarPelotas(int x, int y, String name, Color color, String otherBallData) {
        PelotasType type = PelotasFactory.getBallType(name, color, otherBallData);
        Pelotas ball = new Pelotas(x, y, type);
        balls.add(ball);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Pelotas ball : balls) {
            ball.draw(graphics);
        }
    }
}
