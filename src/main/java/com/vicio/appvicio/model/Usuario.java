package com.vicio.appvicio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Endereco endereco;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<Vicio> vicios;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<Feedback> feedbacks;

}
