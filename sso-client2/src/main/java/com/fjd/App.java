package com.fjd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhuPengWei on 2018/1/11.
 */
@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class App {

    @GetMapping("/user")
    public Authentication user(Authentication user) {
        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}