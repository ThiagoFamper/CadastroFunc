package br.edu.famper.cadastrofunc.repository;

import br.edu.famper.cadastrofunc.model.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
}
