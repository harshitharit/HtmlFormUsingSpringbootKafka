package com.harshit.htmlformusingspringbootkafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer
{


    @KafkaListener(topics ="${kafka.topic.name}" , groupId = "HH")
    public void consume(AccountDetails accountDetails){
        System.out.println("Data recieved Successfully" + accountDetails);
    }
}
