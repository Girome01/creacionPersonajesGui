/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaBatalla;

import InterfazJuego.campoBatalla_Juego;
import LogicaJuego.AerialWarrior;
import LogicaJuego.CharacterGame;
import java.awt.Image;
import java.io.Serializable;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Jennifer
 */
public class HiloBatalla extends Thread implements Serializable{
    private campoBatalla_Juego refPantalla;
    public JLabel refLabel;
    public JLabel refArma;
    int numero;
    private boolean running = true;
    private boolean paused = false;
    public CharacterGame guerrero;
    HiloBatalla enemigo ;

    public HiloBatalla(campoBatalla_Juego refPantalla, JLabel refLabel, JLabel refArma, int numero, CharacterGame guerrero) {
        this.refPantalla = refPantalla;
        this.refLabel = refLabel;
        this.refArma = refArma;
        this.numero = numero;
        this.guerrero = guerrero;
    }

     public void run(){
        
        while(running){            
            try {
                if (this.guerrero.getcLife() > 0){
                    // Si se agrega el tipo de guerre en la clase cambiar los if
                    //if(this.guerrero.tipoGuerrero.equalsIgnoreCase("Guerrero aéreo"){
                    if(this.guerrero.getcName().equalsIgnoreCase("Guerrero aéreo")){
                      
                    }else{  refPantalla.moveLabel(refLabel, refArma);}
                    enemigo = refPantalla.batalla.getEnemy(this);
                    refPantalla.escribirHilos("Soy "+this.guerrero.getcName()+" y lucho por mi bando con vida "+this.guerrero.getcLife()+" y ataque "+this.guerrero.getcHitPS());
                }else{
                    enemigo = refPantalla.batalla.getGanador(this);
                    
                    String imagen="C:\\Users\\Usuario\\Desktop\\TEC\\VI_semestre\\Diseno Software\\Proyecto 1\\ProyectoGui\\creacionPersonajesGui\\src\\main\\java\\imagenesJuego\\lapida.png";
                    ImageIcon imageicon = new ImageIcon(imagen);
                    int ancho=imageicon.getIconWidth();
                    int alto=imageicon.getIconHeight();
                    Image img = imageicon.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
                    this.refLabel.setIcon(new ImageIcon(img));
                    this.refLabel.setSize(ancho, alto);
                    this.refLabel.setOpaque(false);
                    
                }
                sleep(2000);
            } catch (InterruptedException ex) { }
            
            
            
            
            while(paused){
                try {
                    sleep(100);
                } catch (InterruptedException ex) {
                    
                }
            }
        }
     }
     public void stopThread(){
        this.running = false;
    }
    
    public void setPaused(){
        paused = !paused;
    }
}
