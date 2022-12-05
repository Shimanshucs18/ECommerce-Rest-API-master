package com.tothenew.shimanshu.CustomValidation;

import com.tothenew.shimanshu.Dto.SignupSellerDao;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidatorForSeller implements ConstraintValidator<PasswordMatchesForSeller, Object> {

    @Override
    public void initialize(final PasswordMatchesForSeller constraintAnnotation) {
        //
    }

    @Override
    public boolean isValid(final Object obj, final ConstraintValidatorContext context) {
        final SignupSellerDao user = (SignupSellerDao) obj;
        return user.getPassword().equals(user.getConfirmPassword());
    }

}