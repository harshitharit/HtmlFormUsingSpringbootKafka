package com.harshit.htmlformusingspringbootkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


   @Autowired
   private Producer producer;

    @PostMapping("/send")
    public String sendAccountDetails(@RequestBody AccountDetails accountDetails) {
        producer.send(accountDetails);
        return "Account Details Sent Successfully";
    }
}