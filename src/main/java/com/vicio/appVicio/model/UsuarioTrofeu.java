package com.vicio.appVicio.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="usuario_trofeu", schema="bd1")
@Data
@IdClass(UsuarioTrofeuId.class)
public class UsuarioTrofeu {

    @Id
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Id
    @Column(name = "id_tipo")
    private Integer idTipo;

    @Id
    @Column(name = "id_nivel")
    private Integer idNivel;
}

class UsuarioTrofeuId implements Serializable {

    private Integer idUsuario;
    private Integer idTipo;
    private Integer idNivel;
}