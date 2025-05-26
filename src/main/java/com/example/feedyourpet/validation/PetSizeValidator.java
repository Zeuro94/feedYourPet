package com.example.feedyourpet.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;


public class PetSizeValidator
        implements ConstraintValidator<PetSize, String> {


    @Override
    public boolean isValid(String value,
                           ConstraintValidatorContext constraintValidatorContext) {
        List<String> allowedSizes = List.of("small", "medium", "large");
        return value != null && allowedSizes.contains(value.toLowerCase());
    }
}
