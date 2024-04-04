package com.example.demo.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtResponse {
    // JWT token is generated for successful authentication.
    private String jwtToken;

    // The username is associated with authenticated customer.
    private String userName;
}
