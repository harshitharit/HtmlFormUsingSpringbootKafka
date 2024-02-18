package com.harshit.htmlformusingspringbootkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final KafkaTemplate<String, AccountDetails> kafkaTemplate;
    private final String topic = "Harshit";

    @Autowired
    public Controller(KafkaTemplate<String, AccountDetails> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/send")
    public String sendAccountDetails(@RequestBody AccountDetails accountDetails) {
        kafkaTemplate.send(topic, accountDetails);
        return "Account Details Sent Successfully";
    }
}