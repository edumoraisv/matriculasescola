package com.example.apiEscola.controller;

import com.example.apiEscola.model.Disciplina;
import com.example.apiEscola.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("disciplina")
public class DisciplinaController {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @GetMapping
    public List<Disciplina> getAllDisciplinas() {
        return disciplinaRepository.findAll();
    }

    @PostMapping
    public Disciplina createDisciplina(@RequestBody Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }
}
