import LogicaJuego.Character;
import java.util.ArrayList;
import java.util.HashMap;

public class PFCharacter {
    private static HashMap<String,Character> pfCharacters = new HashMap<>();

   
    public static void addPrototype(String name, Character prototype) {
        pfCharacters.put(name.toUpperCase().strip(), prototype);
        
    }
    public static ArrayList<Character> getPrototype(String key, int quantity) {
        ArrayList<Character> newCharacters = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            newCharacters.add((Character) pfCharacters.get(key.toUpperCase().strip()).clone());
        }
        return newCharacters;
    }
}
