package com.vicio.appVicio.controller;

import com.vicio.appVicio.model.Feedback;
import com.vicio.appVicio.service.FeedbackService;
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
@Api(tags = "Feedback")
@RequestMapping("/feedback")
public class FeedBackController {

    @Autowired
    FeedbackService feedbackService;

    @ApiOperation(value = "Listar")
    @GetMapping
    public List<Feedback> listarTodas(){
        return feedbackService.listarTodos();
    }

    @ApiOperation(value = "Listar por Id")
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Feedback>> buscarPorId (@PathVariable Integer id){
        Optional<Feedback> feedback = feedbackService.buscarPorId(id);
        return feedback.isPresent() ? ResponseEntity.ok(feedback) : ResponseEntity.notFound().build();
    }

    @ApiOperation(value = "Listar por Id de Usuário")
    @GetMapping("/{id_usuario}")
    public ResponseEntity<Feedback> buscaIdUsuario (@PathVariable Integer id){
        Feedback feedback = feedbackService.buscaIdUsuario(id);
        return ResponseEntity.ok(feedback);
    }

    @ApiOperation(value = "Salvar")
    @PostMapping
    public ResponseEntity<Feedback> salvarfeedback (@Valid @RequestBody Feedback feedback){
        Feedback feedbackSalvar = feedbackService.salvarfeedback(feedback);
        return ResponseEntity.status(HttpStatus.CREATED).body(feedbackSalvar);
    }

    @ApiOperation(value = "Atualizar")
    @PutMapping("/{id}")
    public ResponseEntity<Feedback> atualizarfeedback (@Valid Integer id, @PathVariable Feedback feedback){
        return ResponseEntity.ok(feedbackService.atualizarfeedback(id, feedback));
    }

    @ApiOperation(value = "Deletar")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Integer id){
        feedbackService.deletar(id);
    }
}
