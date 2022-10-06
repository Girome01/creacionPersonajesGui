/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaJuego;

/**
 *
 * @author monic
 */
public interface CharacterAction {
    public void cMove();
    public void cDamage(int damage);
    public int cAttack(Character enemyCharacter);
}
