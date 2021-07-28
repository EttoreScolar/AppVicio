package com.vicio.appVicio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="usuario_trofeu", schema="bd1")
@Data
@IdClass(UsuarioTrofeuId.class)
public class UsuarioTrofeu {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Usuario usuario;

    @Id
    @Column(name = "id_tipo")
    private Integer idTipo;

    @Id
    @Column(name = "id_nivel")
    private Integer idNivel;
}

class UsuarioTrofeuId implements Serializable {

    private Integer idTipo;
    private Integer idNivel;
}