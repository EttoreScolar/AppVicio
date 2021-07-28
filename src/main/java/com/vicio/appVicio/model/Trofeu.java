package com.vicio.appVicio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "trofeu", schema = "app_vicios")
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

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "id_tipo"),
            @JoinColumn(name = "id_nivel")
    })
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<UsuarioTrofeu> trofeuUsuario;

}

class TrofeuId implements Serializable {

    private Integer tipoId;
    private Integer nivelId;
}
