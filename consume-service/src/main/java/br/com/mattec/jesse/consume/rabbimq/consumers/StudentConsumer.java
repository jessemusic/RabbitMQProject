package br.com.mattec.jesse.consume.rabbimq.consumers;


import dtos.StudentDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static constantes.RabbitMQConstants.ROUTING_KEY_STUDENT_LOG;

@Log4j2
@Component
public class StudentConsumer {

    @RabbitListener(queues = ROUTING_KEY_STUDENT_LOG)
    public void consumer(StudentDTO dto){
        log.info("Received message {} ", dto.toString());
    }

}
