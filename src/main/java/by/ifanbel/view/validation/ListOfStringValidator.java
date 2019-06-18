package by.ifanbel.view.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

import static java.lang.System.lineSeparator;

public class ListOfStringValidator implements ConstraintValidator<PatternForListOfString, List<String>> {

    private String regexp;

    public void initialize(PatternForListOfString pattern) {
        regexp = pattern.regexp();
    }

    public boolean isValid(List<String> values, ConstraintValidatorContext context) {
        StringBuilder errorMessages = new StringBuilder();
        String defaultMessage = context.getDefaultConstraintMessageTemplate();
        for (int i = 0; i < values.size(); i++) {
            if (!values.get(i).replace(" ", "").replace(",", ".").matches(regexp)) {
                errorMessages.append(defaultMessage).append(" в слое №" + String.valueOf(i+1)).append(lineSeparator());
            }
        }
        if (errorMessages.length() != 0) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(errorMessages.toString()).addConstraintViolation();
            return false;
        }
        return true;
    }

}