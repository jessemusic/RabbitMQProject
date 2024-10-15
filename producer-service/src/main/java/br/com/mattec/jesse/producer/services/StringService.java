package br.com.mattec.jesse.producer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import static constantes.RabbitMQConstants.*;


@Log4j2
@Service
@RequiredArgsConstructor
public class StringService {

    private final RabbitTemplate rabbitTemplate;

    public void produce(String message){
        log.info("Received message {}", message);
        rabbitTemplate.convertAndSend(EXCHANGE_MUSIC_SCHOOL, ROUTING_KEY_STUDENT_MESSAGE_LOG, message );
    }

}
