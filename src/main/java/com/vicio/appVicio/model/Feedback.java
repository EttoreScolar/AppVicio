package com.vicio.appVicio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "feedback", schema = "app_vicios")
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Usuario usuario;

    @Column(name = "data_envio")
    private Date dataEnvio;
}
