package com.tothenew.shimanshu.Dto.Request;

import com.tothenew.shimanshu.CustomValidation.PasswordMatchesForResetPasswordRequest;
import com.tothenew.shimanshu.CustomValidation.ValidPassword;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@PasswordMatchesForResetPasswordRequest
public class ResetPasswordDto {

    @NotBlank(message = "Password Reset Token cannot be blank")
    private String token;

    @ValidPassword
    private String password;

    @NotBlank(message = "Password cannot be empty")
    @Size(min = 8, max = 16, message = "Password should be same to Password")
    private String confirmPassword;
}