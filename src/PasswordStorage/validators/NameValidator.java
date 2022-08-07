package PasswordStorage.validators;

import PasswordStorage.exceptions.ValidateException;
import PasswordStorage.exceptions.ValidateNameException;

public class NameValidator implements Validator {

    @Override
    public void validate(String value) throws ValidateException {
        if(value.isEmpty()) {
            throw new ValidateNameException("Имя не должно быть пустым");
        }

    }// допишите код класса
}
