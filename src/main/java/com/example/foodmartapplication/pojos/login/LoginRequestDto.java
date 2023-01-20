package com.example.foodmartapplication.pojos.login;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginRequestDto {

    //    @Email(message = "Email must not be null")
    private String email;

    //    @NotNull(message = "Password must not be null")
    private String password;

}
