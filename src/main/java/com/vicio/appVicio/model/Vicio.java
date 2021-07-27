package com.vicio.appVicio.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="vicio", schema="bd1")
@Data
public class Vicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vicio")
    private Integer vicioId;

    @Column(name = "data_fim")
    private Date dataFim;

    @Column(name = "data_inicio")
    private Date dataInicio;

    @Column(name = "cor")
    private String cor;

    @Column(name = "observacao")
    private String observacao;

    @Column(name = "nome")
    private String nome;

    @Column(name = "id_usuario")
    private Integer usuarioId;
}
