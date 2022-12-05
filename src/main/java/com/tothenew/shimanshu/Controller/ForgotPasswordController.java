package com.tothenew.shimanshu.Controller;

import com.tothenew.shimanshu.Dto.Request.ResetPasswordDto;
import com.tothenew.shimanshu.Service.PasswordResetTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;

@RestController
@RequestMapping("/api/user")
public class ForgotPasswordController {

    @Autowired
    PasswordResetTokenService passwordResetTokenService;

    @PostMapping("/forgot-password")
    public ResponseEntity<?> forgotPassword(@Email @RequestParam String email) {
        return passwordResetTokenService.forgotPassword(email);
    }


    @PatchMapping("/reset-password")
    public ResponseEntity<?> resetPassword(@Valid @RequestBody ResetPasswordDto resetPasswordDto) {
        return passwordResetTokenService.resetPassword(resetPasswordDto);
    }
}
