/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaBatalla;
import InterfazJuego.campoBatalla_Juego;
import LogicaJuego.AerialWarrior;
import LogicaJuego.CharacterGame;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JLabel;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Jennifer
 */
public class Batalla implements Serializable{
    protected campoBatalla_Juego refPantalla;
    protected ArrayList<HiloBatalla> army;
    protected ArrayList<HiloBatalla> enemies;
    protected ArrayList<CharacterGame> defensas;
    //protected Personajes listaEscogida;
    protected ArrayList<CharacterGame> listaEscogida;
    
    public Batalla(campoBatalla_Juego refPantalla, ArrayList<CharacterGame> personajes) {
       this.refPantalla = refPantalla;
       this.listaEscogida = personajes;
       army = new ArrayList<HiloBatalla>();
       enemies = new ArrayList<HiloBatalla>();
    }
    
    public void generateArmy(){
        //Recordar cambiar la listaEscogida para que este adeacuerdo con la clase Personajes
        //Utilizar el ArrayList de la calse Personajes solo si la calse existe
        for (int i = 0; i < listaEscogida.size(); i++) {
            String nombreArchivo = listaEscogida.get(i).getcAppearance(1,"STOP");
            JLabel labelForThread = refPantalla.generateLabel(nombreArchivo, 270, 20);
            army.add(new HiloBatalla(refPantalla, labelForThread, (i+1), listaEscogida.get(i)));
        }
    }
    
    public void subirNivelEnemy(){
        //implementar si existe la clase personajes.
    }
    
    public void generateEnemy(){
        //Por el momento los enemigos seran los mismos que los del usuario
        //Si se genera Personajes esto cambia
        
       for (int i = 0; i < listaEscogida.size(); i++) {
            String nombreArchivo = listaEscogida.get(i).getcAppearance(1,"Stop");
            JLabel labelForThread = refPantalla.generateLabel(nombreArchivo, 270, 20);
            enemies.add(new HiloBatalla(refPantalla, labelForThread, (i+1), listaEscogida.get(i)));
        }
    }
    
    public void startArmy(){
        for (int i = 0; i < army.size(); i++) {
            army.get(i).start();
        }
    }
    
    public void startEnemy(){
        for (int i = 0; i < enemies.size(); i++) {
            enemies.get(i).start();
        }
    }
    
    public void pauseArmy(){
        for (int i = 0; i < army.size(); i++) {
            army.get(i).setPaused();
        }
         for (int i = 0; i < enemies.size(); i++) {
            enemies.get(i).setPaused();
        }
    }
    
     public void stopArmy(){
        for (int i = 0; i < army.size(); i++) {
            army.get(i).stopThread();
        }
        for (int i = 0; i < enemies.size(); i++) {
            enemies.get(i).stopThread();
        }
    }
    
    public boolean isAvailable(int x, int y){
        for (int i = 0; i < army.size(); i++){
            if (x == army.get(i).refLabel.getLocation().x && y == army.get(i).refLabel.getLocation().y)
                return false;
        }
        for (int i = 0; i < enemies.size(); i++){
            if (x == enemies.get(i).refLabel.getLocation().x && y == enemies.get(i).refLabel.getLocation().y)
                return false;
        }
        return true;
    }
    
    public HiloBatalla getGanador(HiloBatalla guerrero){
        String ganador="";
        boolean esArmy = army.contains(guerrero);
        if (esArmy){
            for (int i = 0; i < army.size(); i++) {
                if (army.get(i).guerrero.getcLife() > 0)
                    return null;
            }
            ganador="Enemigos";
            stopArmy();
            
            }else {
            for (int i = 0; i < enemies.size(); i++) {
                if(enemies.get(i).guerrero.getcLife() > 0 )
                    return null;
            }
           ganador="Aliados";
           stopArmy();
        }
        refPantalla.mostrarGanador(ganador);
        return null;
    }
    
    public boolean enRangoDefensa(HiloBatalla guerrero, int cercano, int num){   
        return false;
    } 
    
   public boolean enRango(HiloBatalla guerrero, int cercano, int num) {
       //Cambiar getName por get tipo de guerrero si se agrega
       // Se necesita que se devuelva el rango de ataque 
       return (cercano/num <= guerrero.guerrero.cgetRange());
       /*if (guerrero.guerrero.tipoGuerrero.equalsIgnoreCase("Guerrero aéreo")){
            AerialWarrior guerreroA = new GuerreroAereo(guerrero.guerrero.nombre, guerrero.guerrero.vida, guerrero.guerrero.golpes, guerrero.guerrero.lvlAparicion, guerrero.guerrero.espacios, guerrero.guerrero.nivel, guerrero.guerrero.rutaImagenA, guerrero.guerrero.rutaImagenE, guerrero.guerrero.tipoGuerrero);
            guerreroA.sonarGuerrero();
            if (cercano/num <= guerreroA.alcance){
                return true;}
        }
        else if (guerrero.guerrero.tipoGuerrero.equalsIgnoreCase("Guerrero de mediano alcance")){
            GuerreroMedioAlcance guerreroMA = new GuerreroMedioAlcance(guerrero.guerrero.nombre, guerrero.guerrero.vida, guerrero.guerrero.golpes, guerrero.guerrero.lvlAparicion, guerrero.guerrero.espacios, guerrero.guerrero.nivel, guerrero.guerrero.rutaImagenA, guerrero.guerrero.rutaImagenE, guerrero.guerrero.tipoGuerrero);
            if (cercano/num <= guerreroMA.alcance)
                return true;
        }
        else if (guerrero.guerrero.tipoGuerrero.equalsIgnoreCase("Gran Bestia")){
            GrandeBestia guerreroGB = new GrandeBestia(guerrero.guerrero.nombre, guerrero.guerrero.vida, guerrero.guerrero.golpes, guerrero.guerrero.lvlAparicion, guerrero.guerrero.espacios, guerrero.guerrero.nivel, guerrero.guerrero.rutaImagenA, guerrero.guerrero.rutaImagenE, guerrero.guerrero.tipoGuerrero);
            if (cercano/num <= guerreroGB.alcance)
                return true;
        }
        else{
            if (cercano==23 || cercano==30 || cercano==num){
                if (guerrero.guerrero.tipoGuerrero.equalsIgnoreCase("Guerrero de contacto")){
                    GuerreroContacto guerreroC = new GuerreroContacto(guerrero.guerrero.nombre, guerrero.guerrero.vida, guerrero.guerrero.golpes, guerrero.guerrero.lvlAparicion, guerrero.guerrero.espacios, guerrero.guerrero.nivel, guerrero.guerrero.rutaImagenA, guerrero.guerrero.rutaImagenE, guerrero.guerrero.tipoGuerrero);
                    guerreroC.sonarGuerrero();
                }
                else{
                    Heroe guerreroH = new Heroe(guerrero.guerrero.nombre, guerrero.guerrero.vida, guerrero.guerrero.golpes, guerrero.guerrero.lvlAparicion, guerrero.guerrero.espacios, guerrero.guerrero.nivel, guerrero.guerrero.rutaImagenA, guerrero.guerrero.rutaImagenE, guerrero.guerrero.tipoGuerrero);
                    guerreroH.sonarGuerrero();
                }
            return true;
        }}
        return false;*/
    }
    
    public HiloBatalla getEnemy(HiloBatalla guerrero) {
        int cercano = 800;
        int xGuerrero = guerrero.refLabel.getLocation().x;
        int yGuerrero = guerrero.refLabel.getLocation().y;
        int distanciax;
        int distanciay;
        int xEnemigo=0;
        int yEnemigo=0;
        int menor;
        int num = 0;
        String coordenada = "";
        boolean esArmy = army.contains(guerrero);
         
        if (esArmy){
            for (int i = 0; i < enemies.size(); i++) {
                if (xGuerrero > enemies.get(i).refLabel.getLocation().x) {
                    distanciax = xGuerrero - enemies.get(i).refLabel.getLocation().x;}
                else {
                    distanciax = enemies.get(i).refLabel.getLocation().x - xGuerrero;
                }
                if (yGuerrero > enemies.get(i).refLabel.getLocation().y) {
                    distanciay = yGuerrero - enemies.get(i).refLabel.getLocation().y;
                }
                else {
                    distanciay = enemies.get(i).refLabel.getLocation().y - yGuerrero;
                }
                menor =  (int) Math.sqrt(Math.pow(distanciax, 2) + Math.pow(distanciay, 2));
                if (menor < cercano){
                    cercano = menor;
                    xEnemigo=enemies.get(i).refLabel.getLocation().x;
                    yEnemigo=enemies.get(i).refLabel.getLocation().y;
                }
                if (distanciax == 0)
                    num = 30;
                else if(distanciay ==0){
                    num = 23;
                }
                else{
                    num = (int) Math.sqrt(Math.pow(23, 2) + Math.pow(30, 2));
                }
            }
            for (int i = 0; i < enemies.size(); i++){
                if (enemies.get(i).refLabel.getLocation().x == xEnemigo && enemies.get(i).refLabel.getLocation().y == yEnemigo ){
                    if (enemies.get(i).guerrero.getcLife() > 0){
                        
                        if (enRango(guerrero, cercano, num)){
                            guerrero.guerrero.cAttack(enemies.get(i).guerrero);
                        }
                    return null;
                }
            }
        } 
        }
        
        else {
            for (int i = 0; i < army.size(); i++) {
                if (xGuerrero > army.get(i).refLabel.getLocation().x) {
                    distanciax = xGuerrero - army.get(i).refLabel.getLocation().x;
                }
                else {
                    distanciax = army.get(i).refLabel.getLocation().x - xGuerrero;
                }
                if (yGuerrero > army.get(i).refLabel.getLocation().y) {
                    distanciay = yGuerrero - army.get(i).refLabel.getLocation().y;
                }
                else{
                    distanciay = army.get(i).refLabel.getLocation().y - yGuerrero;
                }
                menor =  (int) Math.sqrt(Math.pow(distanciax, 2) + Math.pow(distanciay, 2));
                
                if (menor < cercano) {
                    cercano = menor;
                    xEnemigo=army.get(i).refLabel.getLocation().x;
                    yEnemigo=army.get(i).refLabel.getLocation().y;
                }
                if (distanciax == 0)
                    num=30;
                else if(distanciay ==0){
                    num=23;
                }
                else{
                    num = (int) Math.sqrt(Math.pow(23, 2) + Math.pow(30, 2));
                }
            }
            for (int i = 0; i < army.size(); i++){
                if (army.get(i).refLabel.getLocation().x == xEnemigo && army.get(i).refLabel.getLocation().y == yEnemigo ){
                    if (army.get(i).guerrero.getcLife() > 0){
                        if (enRango(guerrero, cercano, num)){
                            guerrero.guerrero.cAttack(army.get(i).guerrero);
                        }
                    return null;
                }
            }
        } 
    }
    return null;
}
 */
}
