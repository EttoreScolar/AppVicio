package com.vicio.appVicio.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="usuario_trofeu", schema="bd1")
@Data
public class UsuarioTrofeu {

    @Id
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Id
    @Column(name = "id_tipo")
    private Date idTipo;

    @Id
    @Column(name = "id_nivel")
    private Date idNivel;
}
