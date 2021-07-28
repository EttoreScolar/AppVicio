package com.vicio.appvicio.controller.web;

import com.vicio.appvicio.model.Feedback;
import com.vicio.appvicio.service.FeedbackService;
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
