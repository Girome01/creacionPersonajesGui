/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package disenno.creacionpersonajesgui;
import LogicaJuego.*;
import java.util.HashMap;
/**
 *
 * @author Usuario
 */
public class CreacionPersonajesGui {

    public static void main(String[] args) {
        
        Appearance aBarbara = new Appearance();
        aBarbara.addAppearance("MOVE", "https://");
        
         HashMap<Integer, Appearance> cAppearance = new HashMap<>();
        cAppearance.put(1, aBarbara);
        
        HalfRangeWarrior arquera = (HalfRangeWarrior) new HalfRangeWarrior.HalfRangeWarriorBuilder()
                .setcName("arquera")
                .setcCost(0)
                .setcAppearance(cAppearance)
                .setcLife(0)
                .setcLevel(0)
                .setcSpawnLevel(0)
                .setcStorageSpace(0)
                .setcHitPS(0)
                .build();
        
      
    }
}
