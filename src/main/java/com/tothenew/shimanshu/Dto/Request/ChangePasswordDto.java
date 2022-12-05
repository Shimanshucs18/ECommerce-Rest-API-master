package com.tothenew.shimanshu.Dto.Request;

import com.tothenew.shimanshu.CustomValidation.PasswordMatchesForChangePasswordRequest;
import com.tothenew.shimanshu.CustomValidation.ValidPassword;
import lombok.Data;
import javax.validation.constraints.NotBlank;

@Data
@PasswordMatchesForChangePasswordRequest
public class ChangePasswordDto {

    @NotBlank(message = "Access token cannot be blank")
    private String accessToken;

    @ValidPassword
    private String password;

    @NotBlank(message = "Confirm Password should be same to Password")
    private String confirmPassword;
}