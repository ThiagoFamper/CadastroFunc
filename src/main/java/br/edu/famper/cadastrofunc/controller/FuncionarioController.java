package br.edu.famper.cadastrofunc.controller;

import br.edu.famper.cadastrofunc.model.Funcionario;
import br.edu.famper.cadastrofunc.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<List<Funcionario>> findAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(funcionarioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Funcionario>> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(funcionarioService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Funcionario> create(@RequestBody Funcionario funcionario) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(funcionarioService.salvar(funcionario));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> update(@RequestBody Funcionario funcionario) {
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(funcionarioService.update(funcionario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        funcionarioService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
