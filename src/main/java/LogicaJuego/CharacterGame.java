package LogicaJuego;

import java.util.ArrayList;
import java.util.HashMap;


public class CharacterGame implements iPrototype {
    protected String cName; 
    protected HashMap<Integer, Appearance> cAppearance;
    protected int cSpawnLevel;
    protected int cHitPS;
    protected int cLife;
    //private int[][] cStorageSpace;
    protected int cStorageSpace;
    protected double cCost;
    protected int cLevel;
    protected HashMap<String, Gear> cGear = new HashMap<>();

     public CharacterGame(CharacterBuilder<?> builder) {
            this.cName = builder.cName;
            this.cAppearance = builder.cAppearance;
            this.cSpawnLevel = builder.cSpawnLevel;
            this.cHitPS = builder.cHitPS;
            this.cLife = builder.cLife;
            this.cStorageSpace = builder.cStorageSpace;
            this.cCost = builder.cCost;
            this.cLevel = builder.cLevel;
        }
    
    public CharacterGame(String cName, HashMap<Integer, Appearance> cAppearance, int cSpawnLevel, int cHitPS, int cLife,
                int cStorageSpace, double cCost, int cLevel) {
            this.cName = cName;
            this.cAppearance = cAppearance;
            this.cSpawnLevel = cSpawnLevel;
            this.cHitPS = cHitPS;
            this.cLife = cLife;
            this.cStorageSpace = cStorageSpace;
            this.cCost = cCost;
            this.cLevel = cLevel;
        }

    public void cLevelUp(){
        this.cLevel+=1;
    }
    
    public void cAddGear(String name, Gear newGear){
        this.cGear.put(name.toUpperCase().strip(), newGear);
    }

    public void cActiveDisableGear(String gearName, boolean state){
        this.cGear.get(gearName.toUpperCase().strip()).setgActive(state);  
    }
    
    public void cDamage(int damage){
        if(this.cLife>0){
            if(this.cLife>=damage){
                this.setcLife(this.cLife-damage);      
            }
            else if(this.cLife-damage<=0){
                this.cLife=0;
            }
        }
        
    }
    
    public int cAttack(CharacterGame enemyCharacter){
        //Este método se usa sólo si el character está en el range del atacante.
        int damage= 0;
        for(int i=0; i<enemyCharacter.cShowGearList().size(); i++){
            if(enemyCharacter.cShowGearList().get(i).isgActive()){
                damage = enemyCharacter.cShowGearList().get(i).getgDamage(); 
                 enemyCharacter.cDamage(damage);
                 return damage;
            }
        }
        enemyCharacter.cDamage(this.cHitPS);
        return this.cHitPS;
        
    }  
    
    public ArrayList<Gear> cShowGearList(){
        ArrayList<Gear> gearList = new ArrayList<>();
        cGear.entrySet().forEach(entry -> {
            gearList.add(entry.getValue());
        });
        return gearList;
        //System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
    }
        
    @Override
    public iPrototype clone() {
        
        return new CharacterGame(cName, cAppearance, cSpawnLevel, cHitPS, cLife, cStorageSpace, cCost, cLevel);
    }
    @Override
    public iPrototype deepClone() {
        //Revisar cuando se necesite una list con nuevas armas
        return clone();
    }

    public static class CharacterBuilder <T extends CharacterBuilder<T>> {
        private String cName; 
        private HashMap<Integer, Appearance> cAppearance;
        private int cSpawnLevel;
        private int cHitPS;
        private int cLife;
        //private int[][] cStorageSpace;
        private int cStorageSpace;
        private double cCost;
        private int cLevel;
        private HashMap<String, Gear> cGear;

       // @Override
        public CharacterGame build() {
            return new CharacterGame(this);
        }


        public CharacterBuilder setcName(String cName) {
            this.cName = cName;
            return this;
        }


        public CharacterBuilder setcAppearance(HashMap<Integer, Appearance> cAppearance) {
            this.cAppearance = cAppearance;
            return this;
        }


        public CharacterBuilder setcSpawnLevel(int cSpawnLevel) {
            this.cSpawnLevel = cSpawnLevel;
            return this;
        }


        public CharacterBuilder setcHitPS(int cHitPS) {
            this.cHitPS = cHitPS;
            return this;
        }


        public CharacterBuilder setcLife(int cLife) {
            this.cLife = cLife;
            return this;
        }


        public CharacterBuilder setcStorageSpace(int cStorageSpace) {
            this.cStorageSpace = cStorageSpace;
            return this;
        }


        public CharacterBuilder setcCost(double cCost) {
            this.cCost = cCost;
            return this;
        }


        public CharacterBuilder setcLevel(int cLevel) {
            this.cLevel = cLevel;
            return this;
        }

}

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public HashMap<Integer, Appearance> getcAppearance() {
        return cAppearance;
    }

    public void setcAppearance(HashMap<Integer, Appearance> cAppearance) {
        this.cAppearance = cAppearance;
    }

    public int getcSpawnLevel() {
        return cSpawnLevel;
    }

    public void setcSpawnLevel(int cSpawnLevel) {
        this.cSpawnLevel = cSpawnLevel;
    }

    public int getcHitPS() {
        return cHitPS;
    }

    public void setcHitPS(int cHitPS) {
        this.cHitPS = cHitPS;
    }

    public int getcLife() {
        return cLife;
    }

    public void setcLife(int cLife) {
        this.cLife = cLife;
    }

    public int getcStorageSpace() {
        return cStorageSpace;
    }

    public void setcStorageSpace(int cStorageSpace) {
        this.cStorageSpace = cStorageSpace;
    }

    public double getcCost() {
        return cCost;
    }

    public void setcCost(double cCost) {
        this.cCost = cCost;
    }

    public int getcLevel() {
        return cLevel;
    }

    public void setcLevel(int cLevel) {
        this.cLevel = cLevel;
    }

    public HashMap<String, Gear> getcGear() {
        return cGear;
    }

    public void setcGear(HashMap<String, Gear> cGear) {
        this.cGear = cGear;
    }

}
