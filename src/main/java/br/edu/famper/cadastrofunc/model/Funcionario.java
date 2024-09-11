package br.edu.famper.cadastrofunc.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "tbl_funcionario")
@Data
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "funcionario_id")
    private Long codigo;

    @Column(name = "nome", length = 75)
    private String nome;

    @Column(name = "cargo", length = 50)
    private String cargo;

    @Column(name = "departamento", length = 150)
    private String departamento;

    @Column(name = "data_admissao")
    private Date data_admissao;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "telefone", length = 20)
    private String telefone;
}
