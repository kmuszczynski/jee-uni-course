package pl.edu.ug.kap.bakedGoodsCRUD.customValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BreadShapeValidator implements ConstraintValidator<BreadShapeConstraint, String> {


    @Override
    public void initialize(BreadShapeConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.matches("[a-z]+(-[a-z]+)*");
    }
}
