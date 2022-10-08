package LogicaJuego;

import java.util.HashMap;

public class Appearance {
    private HashMap<String, String> aAppearance = new HashMap<>();


    public void addAppearance(String key, String url) {
        aAppearance.put(key.toUpperCase().strip(), url);
    }
    public void getAppearance(String key){
        aAppearance.get(key.toUpperCase().strip());
    }
}
