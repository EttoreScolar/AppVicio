package com.vicio.appvicio.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "feedback", schema = "bd1")
@Data
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_feedback")
    private Integer feedbackId;

    @Column(name = "tipo")
    private Integer tipo;

    @Column(name = "mensagem")
    private String mensagem;

    @Column(name = "id_usuario")
    private Integer usuarioId;

    @Column(name = "data_envio")
    private Date dataEnvio;
}
