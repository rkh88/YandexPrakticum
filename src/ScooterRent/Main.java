package ScooterRent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько самокатов доступно для аренды?");
        int availableScooters = scanner.nextInt(); // Считайте количество доступных самокатов с клавиатуры
        while (availableScooters <= 0) {
            System.out.println("Введите значение больше 0");
            availableScooters = scanner.nextInt();
        }

        System.out.println("Сколько самокатов арендовано?");
        int scootersInUse = scanner.nextInt(); // Считайте число арендованных самокатов с клавиатуры
        while (scootersInUse < 0 || scootersInUse > availableScooters) {
            System.out.println("Введите значение, большее или равное 0");
            availableScooters = scanner.nextInt();
        }
        Scooter scooter = new Scooter(availableScooters, scootersInUse); // Создайте новый объект класса Scooter



        while(true) { // реализуйте непрерывный ввод команд
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 -- Узнать текущую стоимость проката");
            System.out.println("2 -- Выдать самокат");
            System.out.println("3 -- Принять самокат");
            System.out.println("4 -- Завершить работу");
            System.out.println("Введите команду:");
            int command = scanner.nextInt(); // Считайте команду с клавиатуры

            if (command == 1) {
                scooter.getPrice(); // Вызовите нужный метод класса Scooter
            } else if (command == 2) {
                scooter.rentScooter(); // Вызовите нужный метод класса Scooter
            } else if (command == 3) {
                scooter.returnScooter(); // Вызовите нужный метод класса Scooter
            } else if (command == 4) {
                System.out.println("Сеанс работы завершён!");
                break; // Завершите ввод команд и работу программы
            } else {
                System.out.println("Введён неверный код команды.");
            }
        }
    }
}
