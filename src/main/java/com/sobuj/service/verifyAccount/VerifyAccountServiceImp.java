package com.sobuj.service.verifyAccount;

import com.sobuj.models.VerifyAccount;
import com.sobuj.repository.VerifyAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VerifyAccountServiceImp implements VerifyAccountService{
    @Autowired
    private VerifyAccountRepository verifyAccountRepository;

    @Override
    public VerifyAccount create(VerifyAccount verifyAccount) {
        return verifyAccountRepository.save(verifyAccount);
    }

    @Override
    public Optional<VerifyAccount> findByToken(String token) {
        return verifyAccountRepository.findByToken(token);
    }

    @Override
    public Optional<VerifyAccount> findById(Long id) {
        return verifyAccountRepository.findById(id);
    }
}
