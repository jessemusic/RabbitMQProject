package br.com.mattec.jesse.producer.controllers;

import br.com.mattec.jesse.producer.services.StudentService;
import dtos.StudentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    public ResponseEntity<StudentDTO> produces (@RequestBody StudentDTO dto){
        service.createStudent(dto);
        return  ResponseEntity.status(CREATED).build();
    }
}
