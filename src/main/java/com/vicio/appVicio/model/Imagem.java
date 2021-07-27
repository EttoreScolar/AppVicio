package com.vicio.appVicio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_imagem")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<UsuarioImagem> usuarioImagens;
}
