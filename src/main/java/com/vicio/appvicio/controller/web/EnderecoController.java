package com.vicio.appvicio.controller.web;

import com.vicio.appvicio.model.Endereco;
import com.vicio.appvicio.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/endereco")
public class EnderecoController {

    private final EnderecoService enderecoService;

    @Autowired
    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping
    public String listarTodas(Model model) {
        List<Endereco> enderecos = enderecoService.listarTodos();
        model.addAttribute("enderecos", enderecos);
        return "endereco";
    }
}
