package hrynkevych.serhii.homework8_v3;

import java.util.Scanner;

public class Main {
    static Admin admin = new Admin();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Что будем делать?");
            String input = scanner.nextLine();
            if (input.equals("end")) break;
            if (input.equals("Добавить работника")) {
                addWorker();
            }
            if (input.equals("Отобразить работников")) {
                admin.outWorker();
            }
            if (input.equals("Добавить клиента")) {
                addClient();
            }
            if (input.equals("Отобразить клиентов")) {
                admin.outClient();
            }
            if (input.equals("Удалить клиента")) {
                removeClient();
            }
            if (input.equals("Добавить тренеровку")) {
                addWorkout();
            }
        }
    }

    public static void addWorker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи строку в формате: ФИО,роль,стаж работы");
        String inputData = scanner.nextLine();
        String[] arrayFromClass = inputData.split(",");
        try {
            if (admin.addWorker(arrayFromClass[0], arrayFromClass[1], arrayFromClass[2]) < 0) {
                System.out.println("Не сработало, видимо некорректный ввод");
            } else {
                System.out.println("Новый работник добавлен");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Не сработало, видимо некорректный ввод");
        }

    }

    public static void addClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи строку в формате: ФИО");
        String inputData = scanner.nextLine();
        if (admin.addClient(inputData) < 0) {
            System.out.println("Не сработало, видимо некорректный ввод");
        } else {
            System.out.println("Новый клиент добавлен");
        }
    }

    public static void removeClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи строку в формате: ФИО");
        String inputData = scanner.nextLine();
        if (admin.removeClient(inputData) < 0) {
            System.out.println("Не сработало, видимо некорректный ввод");
        } else {
            System.out.println("Клиент удалён");
        }
    }

    public static void addWorkout() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи строку в формате: ФИО клиента,ФИО тренера,количество добавляемых тренировок");
        String inputData = scanner.nextLine();
        String[] arrayFromClass = inputData.split(",");
        try {
        admin.addWorkout(arrayFromClass[0], arrayFromClass[1], arrayFromClass[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Не сработало, видимо некорректный ввод");
        }
    }
}
