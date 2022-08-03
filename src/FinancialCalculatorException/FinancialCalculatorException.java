package FinancialCalculatorException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinancialCalculatorException {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            calculate();// перехват исключения LimitException
        } catch (LimitException e) {
            System.out.println("Превышен лимит ошибок ввода: " + e.getAttempts());
        }
    }

    public static double getInterest(final double rate, final int time, final double principal) {
        final double multiplier = Math.pow(1.0 + rate / 100.0, time) - 1.0;
        return multiplier * principal;
    }

    public static int getIntLimited(String greeting, int attempts) {
        for (int counter = 0; counter < attempts; counter++) {
            try {
                System.out.println(greeting + " => ");
                try {
                    final int value = scanner.nextInt();
                    if (value < 0) {
                        throw new InputException("Введено отрицательное значение");// проверка на отрицательное значение
                        // сгенерируйте исключение "Введено отрицательное значение"
                    }
                    return value;
                } catch (InputMismatchException exception) {
                    throw new InputException("Введено не число");// сгенерируйте исключение "Введено не число"
                }
            } catch (InputException exception) {
                System.out.println("Ошибка ввода: " + exception.getMessage());
                // сгенерируйте вывод формата "Ошибка ввода: " + информация об исключении
            }

            // сгенерируйте исключение LimitException с сообщением "Превышен лимит ошибок ввода"
        }
        throw new LimitException("Превышен лимит ошибок ввода", attempts);
    }

    public static double getDoubleLimited(String greeting, int attempts) {
        for (int counter = 0; counter < attempts; counter++) {
            try {
                System.out.println(greeting + " => ");
                // добавьте недостающий код
                try {
                    final double value = scanner.nextDouble();
                    if (value < 0) {
                        throw new InputException("Введено отрицательное значение");// проверка на отрицательное значение
                        // сгенерируйте исключение "Введено отрицательное значение"
                    }
                    return value;
                } catch (InputMismatchException exception) {
                    throw new InputException("Введено не число");// сгенерируйте исключение "Введено не число"
                }
            } catch (InputException exception) {
                System.out.println("Ошибка ввода: " + exception.getMessage());
                //сгенерируйте вывод формата "Ошибка ввода: " + информация об исключении
            }

            // сгенерируйте исключение LimitException с сообщением "Превышен лимит ошибок ввода"
        }
        throw new LimitException("Превышен лимит ошибок ввода", attempts);
    }

    public static void calculate() {
        final double rate = getDoubleLimited("Введите ставку", 3);
        final double principal = getDoubleLimited("Введите размер вклада", 3);
        final int time = getIntLimited("Введите срок вклада в месяцах", 5);
        System.out.println("Ваша выгода = " + getInterest(rate, time, principal));
    }
}