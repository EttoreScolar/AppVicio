package com.vicio.appVicio.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="usuario_imagem", schema="bd1")
@Data
@IdClass(UsuarioImagemId.class)
public class UsuarioImagem {

    @Id
    @Column(name = "id_imagem")
    private Integer idImagem;

    @Id
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "status")
    private String status;
}

class UsuarioImagemId implements Serializable {

    private Integer idImagem;
    private Integer idUsuario;
}