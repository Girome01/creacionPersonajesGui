package CreacionPersonajes.Logica;

import java.io.Serializable;
import java.util.HashMap;

public class Appearance implements Serializable{
    private HashMap<String, String> aAppearance = new HashMap<>();


    public void addAppearance(String key, String url) {
        aAppearance.put(key.toUpperCase().strip(), url.strip());
    }
    public String getAppearance(String key){
        return aAppearance.get(key.toUpperCase().strip());
    }
    
    public HashMap<String, String> getAppearance2(){
        return aAppearance;
    }
}
