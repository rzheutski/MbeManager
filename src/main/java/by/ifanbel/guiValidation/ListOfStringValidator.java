package by.ifanbel.guiValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class ListOfStringValidator implements ConstraintValidator<PatternForListOfString, List<String>> {

    private String regexp;

    public void initialize(PatternForListOfString pattern) {
        regexp = pattern.regexp();
    }

    public boolean isValid(List<String> values, ConstraintValidatorContext context) {


        for (int i = 0; i < values.size(); i++) {
            if (!values.get(i).replace(" ", "").replace(",", ".").matches(regexp)) {
                String s = context.getDefaultConstraintMessageTemplate();
                context.disableDefaultConstraintViolation();
                context.buildConstraintViolationWithTemplate(s.concat(": ").concat(String.valueOf(i))).addConstraintViolation();
                return false;
            }
        }

        return true;
    }

}