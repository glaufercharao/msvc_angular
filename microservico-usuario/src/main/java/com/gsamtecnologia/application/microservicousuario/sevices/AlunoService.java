package com.gsamtecnologia.application.microservicousuario.sevices;

import com.gsamtecnologia.application.microservicousuario.entities.Aluno;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface AlunoService {
    public Iterable<Aluno> findAll();

    public Optional<Aluno> findById(Long id);

    public Aluno save(Aluno aluno);

    public void deleteById(Long id);
}
