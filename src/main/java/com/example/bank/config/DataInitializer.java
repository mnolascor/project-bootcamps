package com.example.bank.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.bank.model.BankAccount;
import com.example.bank.repository.BankAccountRepository;

@Configuration
public class DataInitializer {
    @Bean
    public CommandLineRunner demo(BankAccountRepository repository) {
        return (args) -> {
            // Crear e insertar algunos valores en la base de datos
            BankAccount bankAccount = new BankAccount();
            bankAccount.setId((long) 1);
            bankAccount.setAccountNumber("1234");
            bankAccount.setBalance(1000.0);
            repository.save(bankAccount);

        };
    }
}
