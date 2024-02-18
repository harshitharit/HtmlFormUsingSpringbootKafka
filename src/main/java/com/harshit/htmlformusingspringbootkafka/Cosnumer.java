package com.harshit.htmlformusingspringbootkafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Cosnumer {
@KafkaListener(topics = "Harshit",groupId = "HH")
    public void consume(AccountDetails accountDetails){
    System.out.println("Data recieved Successfully" + accountDetails);
}
}
