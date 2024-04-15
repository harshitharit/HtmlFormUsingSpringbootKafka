package com.harshit.htmlformusingspringbootkafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    @Value("${kafka.topic.name}")
    private String HarshitTopic;
    @Autowired
    private KafkaTemplate<String,AccountDetails>kafkaTemplate;
    public void send (AccountDetails accountDetails){
        kafkaTemplate.send(HarshitTopic,accountDetails);
        System.out.println("Data Sent Successfully");
    }

}
