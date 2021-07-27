package com.vicio.appVicio.controller;

import com.vicio.appVicio.model.Usuario;
import com.vicio.appVicio.service.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@Api(tags = "Usuario")
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @ApiOperation(value = "Listar")
    @GetMapping
    public List<Usuario> listarTodosUsuarios(){
        return usuarioService.listarTodos();
    }

    @ApiOperation(value = "Listar por Id")
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Usuario>> buscarPorId (@PathVariable Integer id){
        Optional<Usuario> usuario = usuarioService.buscarPorId(id);
        return usuario.isPresent() ? ResponseEntity.ok(usuario) : ResponseEntity.notFound().build();
    }

    @ApiOperation(value = "Salvar")
    @PostMapping
    public ResponseEntity<Usuario> salvarUsuario (@Valid @RequestBody Usuario usuario){
        Usuario usuarioSalvar = usuarioService.salvarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioSalvar);
    }

    @ApiOperation(value = "Atualizar")
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizarUsuario (@Valid Integer id, @PathVariable Usuario usuario){
        return ResponseEntity.ok(usuarioService.atualizarUsuario(id, usuario));
    }

    @ApiOperation(value = "Deletar")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Integer id){
        usuarioService.deletar(id);
    }
}
