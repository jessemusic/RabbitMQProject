package br.com.mattec.jesse.producer.services;

import dtos.StudentDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import static constantes.RabbitMQConstants.EXCHANGE_MUSIC_SCHOOL;
import static constantes.RabbitMQConstants.ROUTING_KEY_STUDENT_LOG;

@Log4j2
@Service
@RequiredArgsConstructor
public class StudentService {

    private final RabbitTemplate rabbitTemplate;

    public void createStudent(StudentDTO dto){

        log.info("Sending a message top exchange {} ", dto.toString());
        rabbitTemplate.convertAndSend(EXCHANGE_MUSIC_SCHOOL, ROUTING_KEY_STUDENT_LOG, dto);
    }
}
