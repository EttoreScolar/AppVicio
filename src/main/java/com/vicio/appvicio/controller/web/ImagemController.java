package com.vicio.appvicio.controller.web;

import com.vicio.appvicio.model.Imagem;
import com.vicio.appvicio.service.ImagemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/imagem")
public class ImagemController {

    @Autowired
    ImagemService imagemService;

    @ApiOperation(value = "Listar")
    @GetMapping
    public List<Imagem> listarTodas(){
        return imagemService.listarTodos();
    }

    @ApiOperation(value = "Listar por Id")
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Imagem>> buscarPorId (@PathVariable Integer id){
        Optional<Imagem> imagem = imagemService.buscarPorId(id);
        return imagem.isPresent() ? ResponseEntity.ok(imagem) : ResponseEntity.notFound().build();
    }

    @ApiOperation(value = "Salvar")
    @PostMapping
    public ResponseEntity<Imagem> salvarImagem (@Valid @RequestBody Imagem imagem){
        Imagem imagemSalvar = imagemService.salvarimagem(imagem);
        return ResponseEntity.status(HttpStatus.CREATED).body(imagemSalvar);
    }

    @ApiOperation(value = "Atualizar")
    @PutMapping("/{id}")
    public ResponseEntity<Imagem> atualizarImagem (@Valid Integer id, @PathVariable Imagem imagem){
        return ResponseEntity.ok(imagemService.atualizarimagem(id, imagem));
    }

    @ApiOperation(value = "Deletar")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Integer id){
        imagemService.deletar(id);
    }
}
