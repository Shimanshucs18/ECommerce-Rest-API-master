package com.tothenew.shimanshu.CustomValidation;

import com.tothenew.shimanshu.Dto.Request.ChangePasswordDto;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidatorForChangePasswordRequest implements ConstraintValidator<PasswordMatchesForChangePasswordRequest, Object> {

    @Override
    public void initialize(final PasswordMatchesForChangePasswordRequest constraintAnnotation) {
        //
    }

    @Override
    public boolean isValid(final Object obj, final ConstraintValidatorContext context) {
        final ChangePasswordDto user = (ChangePasswordDto) obj;
        return user.getPassword().equals(user.getConfirmPassword());
    }

}