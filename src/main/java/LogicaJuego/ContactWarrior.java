/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaJuego;
import CreacionPersonajes.Logica.Appearance;
import CreacionPersonajes.Logica.CharacterGame;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author monic
 */
public class ContactWarrior extends CharacterGame{

     public ContactWarrior(String cName, HashMap<Integer, Appearance> cAppearance, int cSpawnLevel, int cHitPS, int cLife, int cStorageSpace, double cCost, int cLevel) {
        super(cName, cAppearance, cSpawnLevel, cHitPS, cLife, cStorageSpace, cCost, cLevel);
    }
    public ContactWarrior(ContactWarriorBuilder builder) {
        super(builder);
    }
    
     public static ContactWarriorBuilder builder() {
          return new ContactWarriorBuilder();
      }
    
    public static class ContactWarriorBuilder extends CharacterGame.CharacterBuilder<ContactWarriorBuilder>{

        @Override
        public ContactWarrior build() {
            return new ContactWarrior(this);
        }
    }
    

    
    
     
}

    