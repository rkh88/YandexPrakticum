package RoubleConverter;

import java.util.HashMap;
import java.util.Scanner;
import java.lang.Math;

public class Practicum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в современных рублях:");
        double amount = (double) scanner.nextInt();

        System.out.println("Введите год (1913 или 1984)");
        int year = scanner.nextInt();

        switch(year) {
            case(1913):
                amount = amount/884.;
                break;
            case(1984):
                amount = amount/337.;
                break;
            default:
                System.out.println("Для этого года у нас нет данных.");
                return;
        }// Посчитайте, сколько у вас рублей для введённого года.
        // Реализуйте конвертацию для каждого случая.
        // Если для указанного года нет курса, то выведите сообщение
        // "Для этого года у нас нет данных." и прекратите выполнение метода.
        printPrices(year, amount);
        return;// Иначе вызовите метод printPrices.
    }

    public static void printPrices(int year, double amount) {
        System.out.println("В " + year + " году эта сумма приблизительно равнялась бы "
                + String.format("%,.2f", amount) + " р. "
                + "На эти деньги вы могли бы купить следующие товары:");

        HashMap<String, Double> prices = getPrices(year);
        // Найдите все значения, у которых цена меньше переданной суммы.
        /*HashMap<String, Integer> quantities = getQuantities(prices, amount);*/// Определите количество товара, которое можно приобрести на переданную сумму.
        for(String position : prices.keySet()) {
            if (prices.get(position) <= amount) {
                System.out.println(position + " - " + (int) Math.floor(amount/prices.get(position)) + " шт.");
            }

        }// Напечатайте значение в формате «<название> — <количество> шт.».
    }

    public static HashMap<String, Double> getPrices(int year) {
        HashMap<String, Double> prices = new HashMap<>();
        // Добавьте товары в prices в зависимости от значения переменной year.
        switch(year) {
            case (1913): // Цены 1913 года:
                prices.put("Корова", 60.0);
                prices.put("Курица", 0.60);
                prices.put("Рубашка", 1.0);
                prices.put("Шапка гусарская", 12.0);
                prices.put("Гармонь", 7.50);
                prices.put("Рояль", 200.0);
                break;

            // Цены 1984 года:
            case (1984):
                prices.put("Банка сгущёнки", 0.55);
                prices.put("Автомобиль «Запорожец»", 5600.0);
                prices.put("Мороженое", 0.20);
                prices.put("Шапка-ушанка цигейковая", 14.0);
                prices.put("Шампанское «Советское»", 3.6);
                prices.put("Карта мира", 2.54);
                prices.put("Мотоцикл «Восход»", 450.0);
                prices.put("Портативный кассетный магнитофон «Весна-202-1»", 195.0);
                prices.put("Пальто осеннее", 100.0);
                break;
            default:
        }
        return prices;
    }
}
