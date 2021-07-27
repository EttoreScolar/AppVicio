package com.vicio.appVicio.controller;

import com.vicio.appVicio.model.UsuarioTrofeu;
import com.vicio.appVicio.service.UsuarioTrofeuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(tags = "UsuarioTrofeu")
@RequestMapping("/usuario_trofeu")
public class UsuarioTrofeuController {

    @Autowired
    UsuarioTrofeuService usuarioTrofeuService;

    @ApiOperation(value = "Listar")
    @GetMapping
    public List<UsuarioTrofeu> listarTodosUsuarioTrofeus(){
        return usuarioTrofeuService.listarTodos();
    }

    @ApiOperation(value = "Salvar")
    @PostMapping
    public ResponseEntity<UsuarioTrofeu> salvarTrofeu (@Valid @RequestBody UsuarioTrofeu usuarioTrofeu){
        UsuarioTrofeu UsuarioTrofeuSalvar = usuarioTrofeuService.salvarUsuarioTrofeu(usuarioTrofeu);
        return ResponseEntity.status(HttpStatus.CREATED).body(UsuarioTrofeuSalvar);
    }

    @ApiOperation(value = "Atualizar")
    @PutMapping("/{id}")
    public ResponseEntity<UsuarioTrofeu> atualizarUsuarioTrofeu (@Valid Integer id, @PathVariable UsuarioTrofeu usuarioTrofeu){
        return ResponseEntity.ok(usuarioTrofeuService.atualizarUsuarioTrofeu(id, usuarioTrofeu));
    }

    @ApiOperation(value = "Deletar")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Integer id){
        usuarioTrofeuService.deletar(id);
    }


}
