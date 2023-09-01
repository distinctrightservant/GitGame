package com.example.gitgame;
import java.util.HashMap;
import java.util.Map;

public class Vocab {
    private static Map<String, String> map = new HashMap<String, String>();
    private static Map<Integer, String> index = new HashMap<Integer, String>();
    private String word;
    private String definition;
    private static Integer counter = 1;
    private String def2;
    private String def3;
    private String def4;


    public Vocab(String word, String definition) {
        this.word = word;
        this.definition = definition;
        map.put(definition, word);
        index.put(counter, definition);
        counter += 1;
    }
    public Vocab(String word, String def1, String def2, String def3, String def4){
        this.word = word;
        this.definition = def1;
        this.def2 = def2;
        this.def3 = def3;
        this.def4 = def4;
        // Only to fulfill Miscellaneous Requirements I used a better way in my code. To demonstrate I remember overloaded constructors
    }

    public static Map<Integer, String> getIndex() {
        return index;
    }

    public static Map<String, String> getMap() {
        return map;
    }
}
