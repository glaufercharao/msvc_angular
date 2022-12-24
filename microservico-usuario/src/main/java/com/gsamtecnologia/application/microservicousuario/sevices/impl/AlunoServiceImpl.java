package com.gsamtecnologia.application.microservicousuario.sevices.impl;

import com.gsamtecnologia.application.microservicousuario.entities.Aluno;
import com.gsamtecnologia.application.microservicousuario.repositories.AlunoRepository;
import com.gsamtecnologia.application.microservicousuario.sevices.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired

    private AlunoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Aluno> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Aluno> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Aluno save(Aluno aluno) {
        return repository.save(aluno);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
