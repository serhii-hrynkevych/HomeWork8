package hrynkevych.serhii.homework8_v3;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Admin extends People{
    Set<Client> clients = new HashSet<>();
    Set<Worker> workers = new HashSet<>();

    public int addWorker(String newName, String newRole, String workExperience) {
        if (newRole.equals("тренер")) {
            Trainer newTrainer = new Trainer(newName, workExperience);
            workers.add(newTrainer);
            return 0;
        }
        if (newRole.equals("массажист")) {
            Masseur newMasseur = new Masseur(newName, workExperience);
            workers.add(newMasseur);
            return 0;
        }
        return -1;
    }

    public void outWorker() {
        for (Worker i : workers)
            System.out.println(i.role + " - " + i.name + ", опыт работы - " + i.workExperience);
    }

    public int addClient(String newName) {
        Client newClient = new Client(newName);
        if (clients.add(newClient)) {
            return 0;
        }
        return -1;
    }

    public int removeClient(String newName) {
        for (Client i : clients) {
            if (i.name.equals(newName)) {
                clients.remove(i);
                return 0;
            }
        }
        return -1;
    }

    public void outClient() {
        for (Client i : clients)
            System.out.println("Клиент: " + i.name);
    }

    public void addWorkout(String nameTrainer, String nameClient, String numberAddWorkout) {
        int numberAddWorkoutInt = Integer.parseInt(numberAddWorkout);
        //Trainer trainer = new Trainer();

        for (Worker w : workers) {
            if (w.name.equals(nameTrainer) && w.role.equals("тренер")) {
                for (Client c : clients) {
                    if (c.name.equals(nameClient)) {
                        ((Trainer)w).addWorkout(nameTrainer,nameClient, numberAddWorkoutInt);
                    } else {
                        System.out.println("Такой клиент не найден");
                    }
                }
            } else {
                System.out.println("Такой тренер не найден");
            }
        }
    }

    public void addMasseur() {}





}
