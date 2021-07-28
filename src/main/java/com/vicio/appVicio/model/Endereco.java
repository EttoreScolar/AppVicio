package com.vicio.appVicio.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="endereco", schema="app_vicios")
@Data
public class Endereco {

    @Id
    @Column(name="id_usuario")
    private Integer id_usuario;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name="id_usuario", referencedColumnName="id_usuario")
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