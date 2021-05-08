/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Videojuego;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author amartinez
 */
public class PelotasFactory {
    static Map<String, PelotasType> ballTypes = new HashMap<>();

    public static PelotasType getBallType(String name, Color color, String otherBallData) {
        PelotasType result = ballTypes.get(name);
        if (result == null) {
            result = new PelotasType(name, color, otherBallData);
            ballTypes.put(name, result);
        }
        return result;
    }
}
