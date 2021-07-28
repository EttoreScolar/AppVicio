package com.vicio.appvicio.controller.rest;

import com.vicio.appvicio.model.Vicio;
import com.vicio.appvicio.service.VicioService;
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
@Api(tags = "Vicio")
@RequestMapping("/api/vicio")
public class VicioApiController {

    @Autowired
    VicioService vicioService;

    @ApiOperation(value = "Listar")
    @GetMapping
    public List<Vicio> listarTodas(){
        return vicioService.listarTodos();
    }

    @ApiOperation(value = "Listar por Id")
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Vicio>> buscarPorId (@PathVariable Integer id){
        Optional<Vicio> vicio = vicioService.buscarPorId(id);
        return vicio.isPresent() ? ResponseEntity.ok(vicio) : ResponseEntity.notFound().build();
    }

    @ApiOperation(value = "Salvar")
    @PostMapping
    public ResponseEntity<Vicio> salvarvicio (@Valid @RequestBody Vicio vicio){
        Vicio vicioSalvar = vicioService.salvarvicio(vicio);
        return ResponseEntity.status(HttpStatus.CREATED).body(vicioSalvar);
    }

    @ApiOperation(value = "Atualizar")
    @PutMapping("/{id}")
    public ResponseEntity<Vicio> atualizarvicio (@Valid Integer id, @PathVariable Vicio vicio){
        return ResponseEntity.ok(vicioService.atualizarvicio(id, vicio));
    }

    @ApiOperation(value = "Deletar")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Integer id){
        vicioService.deletar(id);
    }
}
