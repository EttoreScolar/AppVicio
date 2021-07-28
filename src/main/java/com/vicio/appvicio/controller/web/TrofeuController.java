package com.vicio.appvicio.controller.web;


import com.vicio.appvicio.model.Trofeu;
import com.vicio.appvicio.service.TrofeuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/trofeu")
public class TrofeuController {
    @Autowired
    TrofeuService trofeuService;

    @ApiOperation(value = "Listar")
    @GetMapping
    public List<Trofeu> listarTodosTrofeus(){
        return trofeuService.listarTodos();
    }

    @ApiOperation(value = "Salvar")
    @PostMapping
    public ResponseEntity<Trofeu> salvarTrofeu (@Valid @RequestBody Trofeu Trofeu){
        Trofeu TrofeuSalvar = trofeuService.salvarTrofeu(Trofeu);
        return ResponseEntity.status(HttpStatus.CREATED).body(TrofeuSalvar);
    }

    @ApiOperation(value = "Atualizar")
    @PutMapping("/{id}")
    public ResponseEntity<Trofeu> atualizarTrofeu (@Valid Integer id, @PathVariable Trofeu Trofeu){
        return ResponseEntity.ok(trofeuService.atualizarTrofeu(id, Trofeu));
    }

    @ApiOperation(value = "Deletar")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Integer id){
        trofeuService.deletar(id);
    }


}
