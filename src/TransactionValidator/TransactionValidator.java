package TransactionValidator;

public class TransactionValidator {
    public static final int MIN_AMOUNT = 1;
    public static final int MAX_AMOUNT = 5000;

    // объявите константы

    public static boolean isValidAmount(double amount) {
        if(amount < MIN_AMOUNT) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        } else if(amount > MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }


        return true;

    }// объявите метод isValidAmount()
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода

}