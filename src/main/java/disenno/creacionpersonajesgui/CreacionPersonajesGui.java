/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package disenno.creacionpersonajesgui;
import InterfazJuego.campoBatalla_Juego;
import LogicaJuego.*;
import java.util.ArrayList;
import java.util.HashMap;
import InterfazJuego.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author Usuario
 */
public class CreacionPersonajesGui {

    public static void main(String[] args) {

        User usuario = new User("Gil", 1);
        escogerPersonajes_Juego seleccion = new escogerPersonajes_Juego(usuario);
        seleccion.setVisible(true);

    }
}
