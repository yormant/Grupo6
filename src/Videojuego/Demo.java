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
public class Demo {
    static int CANVAS_SIZE = 700;
    static int BALLS_TO_DRAW = 5;
    static int BALLS_TYPES = 1;

    public static void main(String[] args) {
        VideoJuego juego = new VideoJuego();
        for (int i = 0; i < Math.floor(BALLS_TO_DRAW / BALLS_TYPES); i++) {
          //  juego.pintarPelotas(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
            //        "Summer Oak", Color.GREEN, "Oak texture stub");
            juego.pintarPelotas(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        juego.setSize(CANVAS_SIZE, CANVAS_SIZE);
        juego.setVisible(true);

        System.out.println(BALLS_TO_DRAW + " Pelotas Dibujadas");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Balls size (8 bytes) * " + BALLS_TO_DRAW);
        System.out.println("+ BallsTypes size (~30 bytes) * " + BALLS_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((BALLS_TO_DRAW * 8 + BALLS_TYPES * 30) 
                / 1024 / 1024) +
                "MB (instead of " + ((BALLS_TO_DRAW * 38) / 1024 / 1024) 
                + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
