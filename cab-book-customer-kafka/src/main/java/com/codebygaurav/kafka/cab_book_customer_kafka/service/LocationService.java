package com.codebygaurav.kafka.cab_book_customer_kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "cab-location", groupId = "customer-group")
    public void cabLocation(String location){
        System.out.println(location);
    }

}
