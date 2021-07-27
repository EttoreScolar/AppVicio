package com.vicio.appVicio.controller;

import com.vicio.appVicio.model.UsuarioImagem;
import com.vicio.appVicio.service.UsuarioImagemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(tags = "UsuarioImagem")
@RequestMapping("/usuario_imagem")
public class UsuarioImagemController {

    @Autowired
    UsuarioImagemService usuarioImagemService;

    @ApiOperation(value = "Listar")
    @GetMapping
    public List<UsuarioImagem> listarTodosUsuarioImagens(){
        return usuarioImagemService.listarTodos();
    }

    @ApiOperation(value = "Salvar")
    @PostMapping
    public ResponseEntity<UsuarioImagem> salvarTrofeu (@Valid @RequestBody UsuarioImagem usuarioImagem){
        UsuarioImagem UsuarioImagemSalvar = usuarioImagemService.salvarUsuarioImagem(usuarioImagem);
        return ResponseEntity.status(HttpStatus.CREATED).body(UsuarioImagemSalvar);
    }

    @ApiOperation(value = "Atualizar")
    @PutMapping("/{id}")
    public ResponseEntity<UsuarioImagem> atualizarUsuarioImagem (@Valid Integer id, @PathVariable UsuarioImagem usuarioImagem){
        return ResponseEntity.ok(usuarioImagemService.atualizarUsuarioImagem(id, usuarioImagem));
    }

    @ApiOperation(value = "Deletar")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Integer id){
        usuarioImagemService.deletar(id);
    }


}
