package hrynkevych.serhii.homework8_v3;

import java.util.HashSet;
import java.util.Set;

public abstract class Worker extends People{
    Set<Client> clients = new HashSet<>();
    String role;
    int workExperience;
}
