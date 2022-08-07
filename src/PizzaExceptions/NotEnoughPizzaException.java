package PizzaExceptions;

public class NotEnoughPizzaException extends Exception {

    public NotEnoughPizzaException(String message) {
        super(message);
    }

    public NotEnoughPizzaException() {
    }
}
