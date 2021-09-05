package com.javalearn.integration;

import java.util.Random;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

	@Autowired
	private GateWayService gateWayService;
	
	
	public String produce() {
        String[] array = {"first line!", "second line!", "third line!"};
        //System.out.println("calling gateway method:-"+gateWayService.greeting("Avinash"));
       // System.out.println("amqpTemplate.");
        return array[new Random().nextInt(3)];
    }
}
