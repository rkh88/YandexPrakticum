package NewYearReminder;

import java.util.ArrayList;

// Ограничьте класс ContactBook так, чтобы он мог хранить в себе только список контактов
public class ContactBook <T extends Contact> {
        // Объявите поле класса contacts - список контактов книги
        ArrayList<T> contacts = new ArrayList<>();

    public void addContact(T contact) {
        contacts.add(contact);
        }

public void printList() {
        // Выведите на экран весь список контактов книги
        for(T t : contacts) {
            System.out.println("Имя: " + t.getName());
            t.print();
        }
}

    public void congratulate(String name) {
        boolean contactPresented = false; //проверяем есть ли контакт в базе
        // Найдите контакт в книге по имени, и отправьте ему сообщение с помощью метода sendMessage()
        for(Contact contact : contacts){
            if(contact.getName().equals(name)){
                contactPresented = true;
                System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
                contact.sendMessage();
            }
        }
        if(contactPresented == false) {

            // Если контакт не найден, выведите соответсвующее сообщение
            System.out.println("Не найден контакт с указанным именем.");
        }

    }

        }
