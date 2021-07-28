package com.vicio.appvicio.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "imagem", schema = "bd1")
@Data
public class Imagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_imagem")
    private Integer imagemId;

    @Column(name = "nome")
    private String nome;

    @Column(name = "imagem")
    private String imagem;

    @Column(name="preco")
    private Integer preco;

    @Column(name="tipo")
    private Integer tipo;
}
