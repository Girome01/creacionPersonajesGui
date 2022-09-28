/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaJuego;
import Interfaz_Juego.campoBatalla_Juego;
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
    protected ArrayList<Guerrero> defensas;
    protected Personajes listaEscogida;
    protected Usuario nuevo;
    
    public Batalla(campoBatalla_Juego refPantalla, Personajes listaPersonajesUsuario, Usuario nuevo) {
        this.refPantalla = refPantalla;
        this.listaEscogida=listaPersonajesUsuario;
        this.nuevo=nuevo;
        army = new ArrayList<HiloBatalla>();
        enemies = new ArrayList<HiloBatalla>();
       
    }
     public ArrayList generateDefensas(){
        Aereos aereod=new Aereos();
        Bombas bombad=new Bombas();
        Canon canond=new Canon();
        Mortero morterod=new Mortero();
        Muro murod=new Muro();
        for (int j=1; j<nuevo.getNivelUsuario();j++){
             aereod.crecerNivel();
             bombad.crecerNivel();
             canond.crecerNivel();
             morterod.crecerNivel();
             murod.crecerNivel();
         }
        
        defensas = new ArrayList<Guerrero>();
        defensas.add(aereod);
        defensas.add(bombad);
        defensas.add(canond);
        defensas.add(morterod);
        defensas.add(murod);
        return defensas;
        
    }
    public void generateArmy(){
        ArrayList<Guerrero> defensas = generateDefensas();
        int largo= ThreadLocalRandom.current().nextInt(1,listaEscogida.listaPersonajes.size() + 1);
         for(int i = 0; i <=largo; i++) {  
            int indice= (int) (Math.random() *(Math.random() * (defensas.size()-1)+1));
            if(defensas.get(indice).lvlAparicion<=nuevo.nivelUsuario){
               String nombreArchivoA=defensas.get(indice).rutaImagenA;
               JLabel labelForThread = refPantalla.generateLabel(nombreArchivoA, 270,20);
               army.add(new HiloBatalla(refPantalla, labelForThread, (i+1), defensas.get(indice)));
            }
         }
        for (int i = 0; i < listaEscogida.listaPersonajes.size(); i++) {
            String nombreArchivo=listaEscogida.listaPersonajes.get(i).rutaImagenA;
            JLabel labelForThread = refPantalla.generateLabel(nombreArchivo, 270, 20);
            army.add(new HiloBatalla(refPantalla, labelForThread, (i+1), listaEscogida.listaPersonajes.get(i)));
        }
    }
    
    public void subirNivelEnemy(Personajes listaPersonajes){
        for (int j=1; j<nuevo.getNivelUsuario();j++){
            if(!listaPersonajes.getListaPersonajesA().isEmpty()){
                for(int i=0;i<listaPersonajes.getListaPersonajesA().size();i++){
                    listaPersonajes.getListaPersonajesA().get(i).crecerNivel();
                }
            }
            if(!listaPersonajes.getListaPersonajesC().isEmpty()){
                for(int i=0;i<listaPersonajes.getListaPersonajesC().size();i++){
                    listaPersonajes.getListaPersonajesC().get(i).crecerNivel();
                }
            }
            if(!listaPersonajes.getListaPersonajesM().isEmpty()){
                for(int i=0;i<listaPersonajes.getListaPersonajesM().size();i++){
                    listaPersonajes.getListaPersonajesM().get(i).crecerNivel();
                }
            }
        }
    }
    
    public void generateEnemy(){
       ArrayList<Guerrero> defensas = generateDefensas();
       Personajes enemigos=(Personajes) FileManager.readObject("C:\\Users\\monic\\OneDrive - Estudiantes ITCR\\Documentos\\NetBeansProjects\\proyecto_HerenciaALTrono\\src\\archivosSerializados\\personajes.juego");
       subirNivelEnemy(enemigos);
 
       int largo= ThreadLocalRandom.current().nextInt(1,enemigos.listaPersonajes.size() + 1);
         for(int i = 0; i <=largo; i++) {  
            int indice= (int) (Math.random() *(Math.random() * (defensas.size()-1)+1));
            if(defensas.get(indice).lvlAparicion<=nuevo.nivelUsuario){
               String nombreArchivoE=defensas.get(indice).rutaImagenE;
               JLabel labelForThread = refPantalla.generateLabel(nombreArchivoE, 580,330);
               enemies.add(new HiloBatalla(refPantalla, labelForThread, (i+1), defensas.get(indice)));
            }
         }
        for(int i = 0; i <=largo; i++) {  
            int indice= (int) (Math.random() *(Math.random() * (enemigos.listaPersonajes.size()-1)+1));
            if(enemigos.listaPersonajes.get(indice).lvlAparicion<=nuevo.nivelUsuario){
               String nombreArchivoE=enemigos.listaPersonajes.get(indice).rutaImagenE;
               JLabel labelForThread = refPantalla.generateLabel(nombreArchivoE, 580,330);
               enemies.add(new HiloBatalla(refPantalla, labelForThread, (i+1), enemigos.listaPersonajes.get(indice)));
            }
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
                if (army.get(i).guerrero.vida > 0 && !(army.get(i).guerrero.tipoGuerrero.equalsIgnoreCase("Defensa")))
                    return null;
            }
            ganador="Enemigos";
            stopArmy();
            
            }else {
            for (int i = 0; i < enemies.size(); i++) {
                if(enemies.get(i).guerrero.vida > 0 && !(enemies.get(i).guerrero.tipoGuerrero.equalsIgnoreCase("Defensa")))
                    return null;
            }
           ganador="Aliados";
           stopArmy();
        }
        refPantalla.mostrarGanador(ganador);
        return null;
    }
    public boolean enRangoDefensa(HiloBatalla guerrero, int cercano, int num){   
        if (guerrero.guerrero.nombre.equalsIgnoreCase("Bomba")){
            Bombas bomba = new Bombas();
            if (cercano/num <= bomba.alcance)
                return true;
        }
        else if (guerrero.guerrero.nombre.equalsIgnoreCase("Aereo")){
            Aereos aereo = new Aereos();
            if (cercano/num <= aereo.alcance)
                return true;
        }
        else if (guerrero.guerrero.nombre.equalsIgnoreCase("Canon")){
            Canon canon = new Canon();
            if (cercano/num <= canon.alcance)
                return true;
        }
        else if (guerrero.guerrero.nombre.equalsIgnoreCase("Torre Arqueros")){
           TorreArqueros torreArqueros = new TorreArqueros();
            if (cercano/num <= torreArqueros.alcance)
                return true;
        }
        else{
            if (cercano==0)
                return true;
        }
        return false;
    } 
    
   public boolean enRango(HiloBatalla guerrero, int cercano, int num) {
        if (guerrero.guerrero.tipoGuerrero.equalsIgnoreCase("Guerrero aéreo")){
            GuerreroAereo guerreroA = new GuerreroAereo(guerrero.guerrero.nombre, guerrero.guerrero.vida, guerrero.guerrero.golpes, guerrero.guerrero.lvlAparicion, guerrero.guerrero.espacios, guerrero.guerrero.nivel, guerrero.guerrero.rutaImagenA, guerrero.guerrero.rutaImagenE, guerrero.guerrero.tipoGuerrero);
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
        return false;
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
                    if (enemies.get(i).guerrero.getVida() > 0){
                        if (guerrero.guerrero.tipoGuerrero.equalsIgnoreCase("Defensa")){
                            if (enRangoDefensa(guerrero, cercano, num)){
                                guerrero.guerrero.atacar(enemies.get(i).guerrero);
                            }
                        }else{
                            if (enRango(guerrero, cercano, num)){
                                guerrero.guerrero.atacar(enemies.get(i).guerrero);
                            }
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
                    if (army.get(i).guerrero.getVida() > 0){
                         if (guerrero.guerrero.tipoGuerrero.equalsIgnoreCase("Defensa")){
                            if (enRangoDefensa(guerrero, cercano, num)){
                                guerrero.guerrero.atacar(army.get(i).guerrero);
                            }
                        }else{
                            if (enRango(guerrero, cercano, num)){
                                guerrero.guerrero.atacar(army.get(i).guerrero);
                            }
                         }
                    return null;
                }
            }
        } 
    }
    return null;
}
 
}
