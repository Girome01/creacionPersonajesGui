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
public class ContactWarrior extends CharacterGame implements CharacterAction{

    public ContactWarrior(String cName, HashMap<Integer, Appearance> cAppearance, int cSpawnLevel, int cHitPS, int cLife, int cStorageSpace, double cCost, int cLevel) {
        super(cName, cAppearance, cSpawnLevel, cHitPS, cLife, cStorageSpace, cCost, cLevel);
    }
    
    //++++++++++IMPORTANTE++++++++++
    //Lógica de movimiento podría ir aquí, pero también podría mantenerse en el archivo del campo de batalla.
    //Implementé la interfaz CharacterAction por si ocupamos métodos abstractos para los personajes, por ejemplo MOVE. 

    @Override
    public void cMoveU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cMoveD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cMoveL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cMoveR() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
     
}

    