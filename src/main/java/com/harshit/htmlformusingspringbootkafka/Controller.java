package com.harshit.htmlformusingspringbootkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
public class Controller {


    @Autowired
    private Producer producer;
    @Autowired
    private AccountService accountService;
   // @GetMapping(value="/fetch")

    @PostMapping(value="/send")
    public String sendAccountDetails(@ModelAttribute AccountDetails accountDetails) {
        producer.send(accountDetails);
        accountService.savedata(accountDetails);
        return "Account Details Sent Successfully";
    }
}