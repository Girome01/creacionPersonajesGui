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
        
        //PRUEBA BUILDER
        /*
        Appearance aBarbara = new Appearance();
        aBarbara.addAppearance("STOP", "C:\\Users\\Usuario\\Desktop\\TEC\\VI_semestre\\Diseno Software\\Proyecto 1\\ProyectoGui\\creacionPersonajesGui\\src\\main\\java\\imagenesJuego\\rojoD.png");
        
        HashMap<Integer, Appearance> cAppearance = new HashMap<>();
        cAppearance.put(1, aBarbara);
        
        ContactWarrior arquera = new ContactWarrior.CharacterBuilder<ContactWarrior>
                .setcName("arquera")
                .setcCost(0)
                .setcAppearance(cAppearance)
                .setcLife(20)
                .setcLevel(0)
                .setcSpawnLevel(0)
                .setcStorageSpace(0)
                .setcHitPS(2)
                .build();
       
        
        //PRUEBA BATALLA
        */
        
        User usuario = new User();
        escogerPersonajes_Juego seleccion = new escogerPersonajes_Juego(usuario);
        seleccion.setVisible(true);
        
        
        
        


    }
}
