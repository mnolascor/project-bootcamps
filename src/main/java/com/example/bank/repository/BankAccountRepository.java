package com.example.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bank.model.BankAccount;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

}
