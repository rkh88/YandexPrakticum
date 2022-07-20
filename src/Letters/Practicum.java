package Letters;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Practicum {
    private static Set<Letter> letters = new LinkedHashSet<>();

    public static void main(String[] args) {
        // информация о письмах (в порядке занесения в систему)
        letters.add(new Letter("Джон Смит", LocalDate.of(2021, 7, 7), "текст письма №1 ..."));
        letters.add(new Letter("Аманда Линс", LocalDate.of(2021, 6, 17), "текст письма №2 ..."));
        letters.add(new Letter("Джо Кью", LocalDate.of(2021, 7, 5), "текст письма №3 ..."));
        letters.add(new Letter("Мишель Фернандес", LocalDate.of(2021, 8, 23), "текст письма №4 ..."));

        printOrderedById(letters);
        printOrderedByDateReceived(letters);
    }

    private static void printOrderedById(Set<Letter> letters) {
        System.out.println("Все письма с сортировкой по ID: ");

        for (Letter letter : letters) {
            System.out.println("    * Письмо от " + letter.authorName + " поступило " + letter.dateReceived);
        }
    }

    private static void printOrderedByDateReceived(Set<Letter> letters) {
        System.out.println("Все письма с сортировкой по дате получения: ");
        TreeSet<Letter> lettersSet = new TreeSet<>(new Comparator<Letter>() {
            @Override
            public int compare(Letter o1, Letter o2) {
                return o1.dateReceived.compareTo(o2.dateReceived);
            }
        });
        lettersSet.addAll(letters);
        for(Letter letter : lettersSet) {
            System.out.println("    * Письмо от " + letter.authorName + " поступило " + letter.dateReceived);
        }
        // реализуйте этот метод
    }

    static class Letter {
        public String authorName;      // имя отправителя
        public LocalDate dateReceived; // дата получения письма
        public String text;            // текст письма

        public Letter(String senderName, LocalDate dateReceived, String text) {
            this.authorName = senderName;
            this.dateReceived = dateReceived;
            this.text = text;
        }
    }
}
