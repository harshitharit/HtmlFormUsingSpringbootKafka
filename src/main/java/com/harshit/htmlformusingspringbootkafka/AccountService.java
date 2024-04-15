package com.harshit.htmlformusingspringbootkafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private final AccountDetailsRepository accountDetailsRepository;
    @Autowired
    public AccountService(AccountDetailsRepository accountDetailsRepository) {
        this.accountDetailsRepository = accountDetailsRepository;
    }
public void savedata(AccountDetails accountDetails){
        accountDetailsRepository.save(accountDetails);
}

}

