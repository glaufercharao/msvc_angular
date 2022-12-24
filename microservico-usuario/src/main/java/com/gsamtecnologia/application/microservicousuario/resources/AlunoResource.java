package com.gsamtecnologia.application.microservicousuario.resources;

import com.gsamtecnologia.application.microservicousuario.entities.Aluno;
import com.gsamtecnologia.application.microservicousuario.sevices.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class AlunoResource {

    @Autowired
    private AlunoService service;

    @GetMapping
    public ResponseEntity<?> findAll(){
     return ResponseEntity.ok().body(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findById(id).orElseThrow());
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Aluno aluno){
        return ResponseEntity.ok().body(service.save(aluno));
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> editar(@PathVariable Long id, @RequestBody Aluno aluno){
        Optional<Aluno> optionalAluno = service.findById(id);
        if(optionalAluno.isPresent()){

            Aluno alunoDB = optionalAluno.get();

            alunoDB.setNome(aluno.getNome());
            alunoDB.setSobreNome(aluno.getSobreNome());
            alunoDB.setEmail(aluno.getEmail());

            service.save(alunoDB);
            return ResponseEntity.status(HttpStatus.CREATED).body(alunoDB);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.findById(id);
        return ResponseEntity.noContent().build();
    }

}
