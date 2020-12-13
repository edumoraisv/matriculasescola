package com.example.apiEscola.controller;

import com.example.apiEscola.model.Turma;
import com.example.apiEscola.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("turma")
public class TurmaController {

    @Autowired
    private TurmaRepository turmaRepository;

    @GetMapping
    public List<Turma> getAllTurmas() {
        return turmaRepository.findAll();
    }

    @PostMapping
    public Turma createTurma(@RequestBody Turma turma) {
        return turmaRepository.save(turma);
    }
}
