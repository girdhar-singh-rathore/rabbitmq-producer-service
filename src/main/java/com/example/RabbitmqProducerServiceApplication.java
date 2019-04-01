package com.example;

import com.example.model.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqProducerServiceApplication implements CommandLineRunner {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqProducerServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Message message = new Message();
        message.setName("test message");
        message.setDescription("hey there .. it is a test message !!");
        rabbitTemplate.convertAndSend(message);
    }
}
