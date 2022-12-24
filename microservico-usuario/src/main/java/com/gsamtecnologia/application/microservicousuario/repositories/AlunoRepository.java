package com.gsamtecnologia.application.microservicousuario.repositories;

import com.gsamtecnologia.application.microservicousuario.entities.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
}
