package com.harshit.htmlformusingspringbootkafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    @Autowired
    private KafkaTemplate<String,AccountDetails>kafkaTemplate;
    public void send (AccountDetails accountDetails){
        kafkaTemplate.send("Harshit",accountDetails);
        System.out.println("Data Sent Successfully");
    }

}
