/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaJuego;
//import java.util.HashMap;

import CreacionPersonajes.Logica.Appearance;
import CreacionPersonajes.Logica.CharacterGame;
import java.io.Serializable;
import java.util.HashMap;


/**
 *
 * @author monic
 */
public class AerialWarrior extends CharacterGame implements Serializable{

    public AerialWarrior(String cName, HashMap<Integer, Appearance> cAppearance, int cSpawnLevel, int cHitPS, int cLife, int cStorageSpace, double cCost, int cLevel) {
        super(cName, cAppearance, cSpawnLevel, cHitPS, cLife, cStorageSpace, cCost, cLevel);
    }
    public AerialWarrior(AerialWarriorBuilder builder) {
        super(builder);
    }
    
     public static AerialWarriorBuilder builder() {
          return new AerialWarriorBuilder();
      }
    
    public static class AerialWarriorBuilder extends CharacterGame.CharacterBuilder<AerialWarriorBuilder>{

        @Override
        public AerialWarrior build() {
            return new AerialWarrior(this);
        }
    }
    

    
    
     
}

    