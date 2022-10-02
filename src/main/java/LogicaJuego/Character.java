import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Character implements iPrototype {
    private String cName; 
    private HashMap<Integer, Appearance> cAppearance;
    private int cSpawnLevel;
    private int cHitPS;
    private int cLife;
    //private int[][] cStorageSpace;
    private int cStorageSpace;
    private double cCost;
    private int cLevel;
    private HashMap<String, Gear> cGear = new HashMap<>();


    public Character(String cName, HashMap<Integer, Appearance> cAppearance, int cSpawnLevel, int cHitPS, int cLife,
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
        cLevel+=1;
    }
    
    public void cMove(){
        //Cambia la imagen establecida en personaje cuando se mueve
    }

    public void cDamage(int damage){
        //Ademas setear la imagen cuando recibe daño
        this.setcLife(cLife-damage);

    }

    public int attack(Character enemyCharacter){
        //Cambiar para tomar en cuenta las armas de los personajes
        enemyCharacter.cDamage(cHitPS);

        return cHitPS;
    }
    
 
    public void cAddGear(String name, Gear newGear){
        cGear.put(name.toUpperCase().strip(), newGear);

    }

    public void cActiveDisableGear(String gearName, boolean state){
        cGear.get(gearName.toUpperCase().strip()).setgActive(state);  
        
    }

    public ArrayList<Gear> cShowGearList(){
        ArrayList<Gear> gearList = new ArrayList<>();
        for (Map.Entry<String, Gear> entry : cGear.entrySet()) {
            gearList.add(entry.getValue());
        }
        return gearList;
            //System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
    }
        
    @Override
    public iPrototype clone() {
        
        return new Character(cName, cAppearance, cSpawnLevel, cHitPS, cLife, cStorageSpace, cCost, cLevel);
    }
    @Override
    public iPrototype deepClone() {
        //Revisar cuando se necesite una playlist con nuevas armas
        return clone();
    }

    private static class CharacterBuilder implements iBuilder{
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

        @Override
        public Character build() {
            
            return new Character(cName, cAppearance, cSpawnLevel, cHitPS, cLife, cStorageSpace, cCost, cLevel);
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

    

}
