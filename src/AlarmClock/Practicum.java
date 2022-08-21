package AlarmClock;

import java.time.Instant;
import java.util.Scanner;

class Practicum {

    public static final int ONE_SECOND_MILLIS = 1000;
    public static final int ONE_MINUTE_MILLIS = 60 * 1000;
    public static final int ONE_HOUR_SECONDS = 60 * 60;
    public static final int ONE_HOUR_MILLIS = ONE_HOUR_SECONDS * 1000;
    public static final int ONE_DAY_SECONDS = 60 * 60 * 24;
    public static final int ONE_DAY_MILLIS = ONE_DAY_SECONDS * 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите отметку времени начала экзамена (в миллисекундах):");
        ... examStartMillis = ...
        // Сконвертируйте введённое значение миллисекунд в экземпляр класса Instant
        Instant examStart = ...
        System.out.println("Введено " + examStart);

        System.out.println("Введите отметку текущего времени (в миллисекундах):");
        ... currentTimeMillis = ...
        // Сконвертируйте введённое значение миллисекунд в экземпляр класса Instant
        Instant currentTime = ...
        System.out.println("Введено " + currentTime);

        // Вычислите время, в которое нужно проснуться
        Instant timeToWakeUp = ...
        // Проверьте, что текущее время не позже времени пробуждения
        if (...) {
            System.out.println("На экзамен уже не успеть, готовься к пересдаче!");
            return;
        }

        // Проверьте, что до времени пробуждения не больше 24 часов
        if (...) {
            System.out.printf("Дней до экзамена: %.0f. До экзамена ещё слишком далеко, волноваться не о чем!%n", calculateDuration(...));
            return;
        }


        System.out.println("Введите желаемую продолжительность сна (в часах):");
        ... sleepGoalHours = ...

        // Проверьте, что введённое количество часов -- положительное
        if (...) {
            System.out.println("Надо поспать хоть сколько-то!");
            return;
        }

        // Вычислите время, в которое нужно ложиться спать
        Instant timeToGoToSleep = ...;
        if (...) {
            System.out.println("Такое количество времени поспать уже не получится!");
            return;
        }

        System.out.printf("На учёбу остаётся: %.0f мс.%n", calculateDuration(...));
        System.out.printf(
                "Это %.2f мин. или %.2f ч.%n",
                calculateDuration(...),
        calculateDuration(...)
        );
        System.out.printf("Ведь проснуться нужно уже через %.2f ч.%n", calculateDuration(...));
    }

    // Вычислите продолжительность в указанных единицах времени
    // Воспользуйтесь константами
    private static double calculateDuration(Instant firstMoment, Instant secondMoment, TimeUnits unit) {
        switch (unit) {
            case MILLIS: {
                return ...
            }
            case SECONDS: {
                return ...
            }
            case MINUTES: {
                return ...
            }
            case HOURS: {
                return ...
            }
            case DAYS: {
                return ...
            }
            default:
                return 0;
        }
    }
}

enum TimeUnits {
    MILLIS,
    SECONDS,
    MINUTES,
    HOURS,
    DAYS
}
