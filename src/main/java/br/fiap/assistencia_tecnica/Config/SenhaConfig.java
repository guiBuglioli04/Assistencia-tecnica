package br.fiap.assistencia_tecnica.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SenhaConfig {
    public BCryptPasswordEncoder hashear(){
        return new BCryptPasswordEncoder(12);
    }
}
