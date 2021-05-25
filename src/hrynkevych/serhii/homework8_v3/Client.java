package hrynkevych.serhii.homework8_v3;

import java.util.HashMap;

public class Client extends People{
    HashMap<String, Integer> workout = new HashMap<>();
    int massage;

    Client(String newName) {
        name = newName;
    }

    Client() {}

}
