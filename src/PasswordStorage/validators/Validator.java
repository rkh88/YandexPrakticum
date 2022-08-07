package PasswordStorage.validators;

import PasswordStorage.exceptions.ValidateException;

public interface Validator {
    void validate(String value) throws ValidateException;
}
