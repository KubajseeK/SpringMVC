package sk.itsovy.kutka.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CodeValidation.class)
public @interface Code {
    String value() default "SVK";
    String message() default "{codeErrorMessage}";
    Class<?>[] groups() default {};

    public abstract Class<? extends Payload>[] payload() default {};
}
