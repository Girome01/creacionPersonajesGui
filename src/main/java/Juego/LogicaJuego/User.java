/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego.LogicaJuego;

import CreacionPersonajes.Logica.CharacterGame;
import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public class User {
    private String name;
    private ArrayList<CharacterGame> warriors;
    private int uLevel;

    public User(String name, int uLevel) {
        this.name = name;
        this.uLevel = uLevel;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<CharacterGame> getWarriors() {
        return warriors;
    }

    public void setWarriors(ArrayList<CharacterGame> warriors) {
        this.warriors = warriors;
    }

    public int getuLevel() {
        return uLevel;
    }

    public void setuLevel(int uLevel) {
        this.uLevel = uLevel;
    }
    
    
    
}
