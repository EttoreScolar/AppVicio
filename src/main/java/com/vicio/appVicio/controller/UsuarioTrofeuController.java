package com.vicio.appVicio.controller;

import com.vicio.appVicio.model.UsuarioImagem;
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

    @ApiOperation(value = "Listar por Id de Usuário, Tipo e Nível")
    @GetMapping("/{id_usuario_tipo_nivel}")
    public ResponseEntity<UsuarioTrofeu> buscaIdUsuarioTipoNivel (@RequestParam Integer id_usuario, @RequestParam Integer id_tipo, @RequestParam Integer id_nivel){
        UsuarioTrofeu usuarioImagem = usuarioTrofeuService.buscaIdUsuarioTipoNivel(id_usuario, id_tipo, id_nivel);
        return ResponseEntity.ok(usuarioImagem);
    }

    @ApiOperation(value = "Listar por Id de Usuário e Tipo")
    @GetMapping("/{id_usuario_tipo}")
    public ResponseEntity<UsuarioTrofeu> buscaIdUsuarioTrofeuTipo (@RequestParam Integer id_usuario, @RequestParam Integer id_tipo){
        UsuarioTrofeu usuarioImagem = usuarioTrofeuService.buscaIdUsuarioTipo(id_usuario, id_tipo);
        return ResponseEntity.ok(usuarioImagem);
    }

    @ApiOperation(value = "Listar por Id de Usuário e Nível")
    @GetMapping("/{id_usuario_nivel}")
    public ResponseEntity<UsuarioTrofeu> buscaIdUsuarioNivel (@RequestParam Integer id_usuario, @RequestParam Integer id_nivel){
        UsuarioTrofeu usuarioImagem = usuarioTrofeuService.buscaIdUsuarioTipo(id_usuario, id_nivel);
        return ResponseEntity.ok(usuarioImagem);
    }
}
