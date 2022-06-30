package NewYearReminder;

public abstract class Contact {
    // Класс должен содержать одно поля - имя пользователя name
    String name;

    public Contact(String name) {
        this.name = name;
    }

    // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакте
            public abstract void sendMessage();

            public abstract void print();

    public String getName() {
        return name;
    }
}