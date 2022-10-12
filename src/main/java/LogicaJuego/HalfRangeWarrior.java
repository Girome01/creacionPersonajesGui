/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaJuego;
import java.util.HashMap;

/**
 *
 * @author monic
 */
public class HalfRangeWarrior extends CharacterGame{

    public HalfRangeWarrior(String cName, HashMap<Integer, Appearance> cAppearance, int cSpawnLevel, int cHitPS, int cLife, int cStorageSpace, double cCost, int cLevel) {
        super(cName, cAppearance, cSpawnLevel, cHitPS, cLife, cStorageSpace, cCost, cLevel);
    }
    public HalfRangeWarrior(HalfRangeWarriorBuilder builder) {
        super(builder);
    }
    
     public static HalfRangeWarriorBuilder builder() {
          return new HalfRangeWarriorBuilder();
      }
    
    public static class HalfRangeWarriorBuilder extends CharacterGame.CharacterBuilder<HalfRangeWarriorBuilder>{

        @Override
        public HalfRangeWarrior build() {
            return new HalfRangeWarrior(this);
        }
    }


    
    
     
}

    