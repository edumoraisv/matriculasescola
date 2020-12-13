package com.example.apiEscola.controller;

import com.example.apiEscola.dto.ProfessorDto;
import com.example.apiEscola.model.Professor;
import com.example.apiEscola.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("professor")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping
    public List<ProfessorDto> getAllProfessores() {
        return ProfessorDto.ofList(professorRepository.findAll());
    }

    @PostMapping
    public Professor createProfessor(@RequestBody Professor professor) {
        return professorRepository.save(professor);
    }
 }
