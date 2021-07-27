package com.vicio.appVicio.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuario", schema = "bd1")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Integer usuarioId;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "tipo_usuario")
    private String tipoUsuario;

    @Column(name = "conectado")
    private Integer conectado;

    @Column(name="joins")
    private Double joins;

}
