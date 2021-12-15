package pl.edu.ug.kap.bakedGoodsCRUD.customValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = BreadShapeValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface BreadShapeConstraint {
    String message() default "Invalid shape";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
