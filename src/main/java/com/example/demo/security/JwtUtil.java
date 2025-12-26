package com.example.demo.security;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;

@Component
public class JwtUtil {

    private SecretKey secretKey;

    @PostConstruct
    public void initKey() {
        secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    }

    public SecretKey getSecretKey() {
        return secretKey;
    }
}
