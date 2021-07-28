package com.vicio.appVicio.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="endereco", schema="app_vicios")
@Data
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_endereco")
    private Integer id_endereco;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_usuario")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Usuario usuario;

    @Column(name="estado")
    private String estado;

    @Column(name="cidade")
    private String cidade;

    @Column(name="cep")
    private String cep;

    @Column(name = "numero")
    private Integer numero;

    @Column(name="rua")
    private String rua;
}