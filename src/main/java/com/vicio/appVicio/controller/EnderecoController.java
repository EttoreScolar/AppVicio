package com.vicio.appVicio.controller;

import com.vicio.appVicio.model.Endereco;
import com.vicio.appVicio.service.EnderecoService;
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
@Api(tags = "Endereco")
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    @ApiOperation(value = "Listar")
    @GetMapping
    public List<Endereco> listarTodas(){
        return enderecoService.listarTodos();
    }

    @ApiOperation(value = "Listar por Id")
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Endereco>> buscarPorId (@PathVariable Integer id){
        Optional<Endereco> endereco = enderecoService.buscarPorId(id);
        return endereco.isPresent() ? ResponseEntity.ok(endereco) : ResponseEntity.notFound().build();
    }

    @ApiOperation(value = "Listar por Id de Usuário")
    @GetMapping("/{id_usuario}")
    public ResponseEntity<Endereco> buscaIdUsuario (@RequestParam Integer id_usuario){
        Endereco endereco = enderecoService.buscaIdUsuario(id_usuario);
        return ResponseEntity.ok(endereco);
    }

    @ApiOperation(value = "Salvar")
    @PostMapping
    public ResponseEntity<Endereco> salvarendereco (@Valid @RequestBody Endereco endereco){
        Endereco enderecoSalvar = enderecoService.salvarendereco(endereco);
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoSalvar);
    }

    @ApiOperation(value = "Atualizar")
    @PutMapping("/{id}")
    public ResponseEntity<Endereco> atualizarendereco (@Valid Integer id, @PathVariable Endereco endereco){
        return ResponseEntity.ok(enderecoService.atualizarendereco(id, endereco));
    }

    @ApiOperation(value = "Deletar")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Integer id){
        enderecoService.deletar(id);
    }
}
