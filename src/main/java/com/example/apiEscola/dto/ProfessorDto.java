package com.example.apiEscola.dto;

import com.example.apiEscola.model.Professor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@AllArgsConstructor
@Getter
public class ProfessorDto {

    private Integer id;
    private String titulacao;
    private List<DisciplinaDtoAgregado> disciplinaDto;

    public ProfessorDto of(Professor professor) {
        return ProfessorDto.builder()
                .id(professor.getId())
                .titulacao(professor.getTitulacao())
                .disciplinaDto(professor.getDisciplina()
                        .stream()
                        .map(disciplina -> DisciplinaDtoAgregado.builder()
                                .id(disciplina.getId())
                                .descricao(disciplina.getDescricao())
                                .build())
                        .collect(Collectors.toList()))
                .build();
    }

    @Builder
    @AllArgsConstructor
    @Getter
    private class DisciplinaDtoAgregado {
        private int id;
        private String descricao;
    }
}
