package com.vicio.appvicio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "trofeu", schema = "bd1")
@Data
@IdClass(TrofeuId.class)
public class Trofeu implements Serializable {

    @Id
    @Column(name ="id_tipo")
    private Integer tipoId;
    @Id
    @Column(name ="id_nivel")
    private Integer nivelId;

    @Column(name="descricao")
    private String descricao;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_imagem")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Imagem imagem;

    @Column(name="pre_requisito")
    private String preRequisito;

}

class TrofeuId implements Serializable {

    private Integer tipoId;
    private Integer nivelId;
}