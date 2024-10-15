package br.com.mattec.jesse.consume.rabbimq.consumers;


import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static constantes.RabbitMQConstants.ROUTING_KEY_STUDENT_MESSAGE_LOG;

@Log4j2
@Component
public class StringConsumer {

    @RabbitListener(queues = ROUTING_KEY_STUDENT_MESSAGE_LOG)
    public void consumer(String message){
        log.info("Consumer received a message ---> {} ", message);

    }
}
