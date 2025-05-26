package com.example.feedyourpet.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PetSizeValidator.class)
public @interface PetSize {
    String message() default "Size must be one of: small, medium, large";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
