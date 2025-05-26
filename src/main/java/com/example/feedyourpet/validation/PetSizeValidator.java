package com.example.feedyourpet.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;


public class PetSizeValidator
        implements ConstraintValidator<PetSize, String> {

    private static final List<String> allowedSizes = List.of("Small", "Medium", "Large");


    @Override
    public boolean isValid(String value,
                           ConstraintValidatorContext constraintValidatorContext) {
        return value != null && allowedSizes.stream()
                .anyMatch(s -> s.equalsIgnoreCase(value));
    }
}
