package com.vicio.appvicio.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="endereco", schema="bd1")
@Data
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Integer enderecoId;

    @Column(name = "id_usuario")
    private Integer usuarioId;

    @Column(name="uf")
    private String uf;

    @Column(name="cidade")
    private String cidade;

    @Column(name="cep")
    private String cep;

    @Column(name = "numero")
    private Integer numero;

    @Column(name="rua")
    private String rua;
}
