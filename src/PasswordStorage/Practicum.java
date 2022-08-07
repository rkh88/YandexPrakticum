package PasswordStorage;

import PasswordStorage.exceptions.ValidateException;
import PasswordStorage.exceptions.ValidateNameException;
import PasswordStorage.exceptions.ValidatePasswordException;
import PasswordStorage.storage.PasswordMemoryStorage;
import PasswordStorage.storage.PasswordStorage;
import PasswordStorage.validators.NameValidator;
import PasswordStorage.validators.PasswordLengthValidator;
import PasswordStorage.validators.PasswordStrengthValidator;
import PasswordStorage.validators.Validator;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Practicum {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Validator> passwordValidators = List.of(
            new PasswordLengthValidator(5), new PasswordStrengthValidator()
    );

    private static final List<Validator> nameValidators = List.of(new NameValidator()); // поработайте со списком

    public static void main(String[] args) throws ValidateException, IOException {
        loop();
    }

    public static void loop() throws ValidateException, IOException {
        while (true) {
            final String action = getAction();
            if ("1".equals(action)) {
                addUser();
            } else if ("2".equals(action)) {
                showUserPassword();
            } else {
                break;
            }
        }
    }

    private static void checkValidatorRules(
            final List<Validator> validators, final String value
    ) throws ValidateException {
        for (Validator validator: validators) {
            validator.validate(value);
        }
    }

    private static void addUser() throws ValidateException, IOException {
        final PasswordStorage storage = new PasswordMemoryStorage();
        // добавьте отлов исключений ValidateNameException и ValidatePasswordException
        // закройте хранилище
        try {
            storage.open();
            System.out.println("Введите имя пользователя => ");
            final String name = scanner.nextLine();
            checkValidatorRules(nameValidators, name);
            System.out.println("Введите пароль пользователя => ");
            final String password = scanner.nextLine();
            checkValidatorRules(passwordValidators, password);
            storage.store(name, password);
        } catch (ValidateNameException e) {
            throw new ValidateNameException("Ошибка валидации имени: " + e.getMessage());
        } catch (ValidatePasswordException e) {
            throw new ValidatePasswordException("Ошибка валидации пароля: " + e.getMessage());
        } catch (IOException e) {
            throw new IOException ("Ошибка работы с хранилищем: " + e.getMessage());
        }
        finally {
            storage.close();
        }
    }

    private static void showUserPassword() throws ValidateException, IOException {
        final PasswordStorage storage = new PasswordMemoryStorage();
        // добавьте отлов исключения ValidateNameException
        // закройте хранилище
        try {
            storage.open();
            System.out.println("Введите имя пользователя => ");
            final String name = scanner.nextLine();
            checkValidatorRules(nameValidators, name);
            final String password = storage.get(name);
            System.out.println(String.format("Пароль пользователя %s = %s", name, password));
        } catch (ValidateNameException e) {
            throw new ValidateNameException("Ошибка валидации имени: " + e.getMessage());
        }  catch (IOException e) {
           throw new IOException ("Ошибка работы с хранилищем: " + e.getMessage());
        }
        finally {
            storage.close();
        }
    }

    private static String getAction() {
        System.out.println("1 - добавить пользователя с паролем");
        System.out.println("2 - отобразить пароль пользователя");
        System.out.println("другие символы - выход");
        System.out.println("Выберите действие => ");
        return scanner.nextLine();
    }
}
