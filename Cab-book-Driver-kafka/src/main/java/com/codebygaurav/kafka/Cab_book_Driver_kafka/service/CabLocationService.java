package com.codebygaurav.kafka.Cab_book_Driver_kafka.service;

import com.codebygaurav.kafka.Cab_book_Driver_kafka.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void updateLocation(String location){
        kafkaTemplate.send(AppConstant.CAB_LOCATION,location);
    }
}
