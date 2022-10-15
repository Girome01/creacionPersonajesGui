/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Juego.InterfazJuego;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Usuario
 */
public class main_Juego {

    public static void main(String[] args) {

        ingreso_Juego frame = new ingreso_Juego();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocation(290, 50);
        frame.setVisible(true);

        //pruebas frame
        /*seleccionarGear juego = new seleccionarGear();
        juego.setVisible(true);*/

    }
}
