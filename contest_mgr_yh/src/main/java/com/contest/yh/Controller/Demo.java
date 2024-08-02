package com.contest.yh.Controller;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtDecoders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;

//@RestController
public class Demo {
    public static void main(String[] args) {

        String token = "eyJraWQiOiI2MjlhNzZmOS00NGQ0LTQzY2YtYjYxNC1kZDg5YTFlYjEwMzMiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJtZXNzYWdpbmctY2xpZW50IiwiYXVkIjoibWVzc2FnaW5nLWNsaWVudCIsIm5iZiI6MTcyMjQwNTA0Miwic2NvcGUiOlsibWVzc2FnZTpyZWFkIl0sImlzcyI6Imh0dHA6Ly9sb2NhbGhvc3Q6OTAwMCIsImV4cCI6MTcyMjQwNTM0MiwiaWF0IjoxNzIyNDA1MDQyLCJqdGkiOiJiYmNmZWU1MS0wYzc4LTQ4YjYtOTY2Yi1jNWZiOWM3MTMwN2MifQ.uQ6HlOPQOZxLYWXJsHIQESwQDvJ3OdnMj8NuoCQ_-5t_9h5Q3G15SH3Ww2KgzGHg2y0DzzeVftqVSKsaJyVmf2U1nS92GosdX5DYW6YxX-TC47gjPAvE1EXoqGBgZDFLpa59C4F0CRcrP_7GarBbWATGsHOySi2kkPfPGAXWDol1sWgtDwlldnzaXtutOgNZ5aqtse0zxOqZZi6m8el8wPaeDMEcazZX07CfchbXpLEokn-i0gHpWOtfgSZQqfYqCEkgqlVx01xkGJvJz5b3qDImhslh0lqxAguHecPNAPI6QQ5WM4Acv73th6LSz_Kuhdl1J8UyWRLi_PREZCnY3g";
        JwtDecoder jwtDecoder = JwtDecoders.fromOidcIssuerLocation("http://localhost:9000");

        Jwt jwt = jwtDecoder.decode(token);

        String issuer = jwt.getIssuer().toString();
        String subject = jwt.getSubject();
        List<String> audience = jwt.getAudience();
        Instant expiresAt = jwt.getExpiresAt();
        Instant issuedAt = jwt.getIssuedAt();
        String jwtId = jwt.getId();
        String clientId = jwt.getClaim("client_id");

        System.out.println("Issuer: " + issuer);
        System.out.println("Subject: " + subject);
        System.out.println("Audience: " + audience);
        System.out.println("Expires At: " + expiresAt);
        System.out.println("Issued At: " + issuedAt);
        System.out.println("JWT ID: " + jwtId);
        System.out.println("Client ID: " + clientId);



    }
}
