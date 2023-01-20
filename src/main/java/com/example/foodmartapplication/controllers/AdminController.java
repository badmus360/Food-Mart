package com.example.foodmartapplication.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@AllArgsConstructor
public class AdminController {

    private AdminService adminService;


    @PostMapping("/password-reset-request")
    public BaseResponse adminRequestToken(@Valid @RequestBody AdminPasswordResetRequestDto adminPasswordResetRequestDto) {
        return adminService.adminRequestNewPassword(adminPasswordResetRequestDto);

    }

    @PostMapping("/password-reset")
    public BaseResponse adminResetPassword(@Valid @RequestBody AdminPasswordResetDto adminPasswordResetDto) {
        return adminService.adminResetPassword(adminPasswordResetDto);
    }
}
