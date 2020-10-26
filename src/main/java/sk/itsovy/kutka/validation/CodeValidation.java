package sk.itsovy.kutka.validation;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodeValidation implements ConstraintValidator<Code, String> {

    private String coursePrefix;

    @Override
    public void initialize(Code theCode) {
        coursePrefix = theCode.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;

        if (s != null) {
            result = s.startsWith(coursePrefix);
        } else {
           return true;
        }

        return result;
    }
}
