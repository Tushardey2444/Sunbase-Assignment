package com.example.demo.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtRequest {
    // The email is associated with customer authentication request.
    private String email;

    // The password is associated with customer authentication request.
    private String password;
}
