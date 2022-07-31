package CheckPrinter;

public class CheckPrinter {
    public static void printCheck1(String[] items) {
        for (String item : items) {
            String[] itemsString = item.split(", ");
            System.out.printf("%-10s, %-10s, %-10s %n", itemsString[0], itemsString[1], itemsString[2]);
        }
    }

    public static void printCheck2(String[] items) {
        int i = 0;
        String[] nameArray = new String[items.length];
        String[] quantityArray = new String[items.length];
        String[] priceArray = new String[items.length];
        for (String item : items) {
            String[] itemsString = item.split(", ");
            nameArray[i] = itemsString[0];
            quantityArray[i] = itemsString[1];
            priceArray[i] = itemsString[2];
            i++;
        }
        for (int j = 0; j < items.length; j++) {
            System.out.printf("%-10s, %-10s, %-10s %n", nameArray[j], quantityArray[j], priceArray[j]);
        }
    }

    private static int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String[] stringArray = {"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"};
        printCheck1(stringArray);
        printCheck2(stringArray);
    }
}