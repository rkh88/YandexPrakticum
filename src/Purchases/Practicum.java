package Purchases;

import java.util.HashSet;
import java.util.List;

class Practicum {
    private static List<String> allPurchases = List.of(
            "яблоки",
            "молоко",
            "колбаса",
            "огурцы",
            "сок",
            "хлеб",
            "виноград",
            "молоко",
            "йогурт",
            "хлеб",
            "пельмени"
    );

    public static void main(String[] args) {
        // переменная uniquePurchases должна содержать множество уникальных товаров
        HashSet<String> uniquePurchases = findUniquePurchases(allPurchases);

        // допишите вывод количества уникальных товаров
        System.out.println( "За месяц было куплено " + uniquePurchases.size() + " уникальных товаров.");
    }

    // реализуйте этот метод
    public static HashSet<String> findUniquePurchases(List<String> allPurchases) {
        HashSet<String> uniquePurchases = new HashSet<>(allPurchases);
        return uniquePurchases;
    }
}
