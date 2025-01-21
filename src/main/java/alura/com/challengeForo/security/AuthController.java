package alura.com.challengeForo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        // Lógica para autenticar al usuario
        return "Token de autenticación";
    }
}
