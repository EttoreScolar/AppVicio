package com.vicio.appVicio.service;

import com.vicio.appVicio.model.Endereco;
import com.vicio.appVicio.repository.EnderecoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    public List<Endereco> listarTodos () {
        return enderecoRepository.findAll();
    }

    public Endereco buscarPorId (Integer id) {
        return enderecoRepository.buscaEnderecoId(id);
    }

    public Endereco buscaIdUsuario (Integer id) { return enderecoRepository.buscaIdUsuario(id); }

    public Endereco salvarendereco (Endereco endereco){
        return enderecoRepository.save(endereco);
    }

    public Endereco atualizarendereco (Integer id, Endereco endereco){
        Endereco u = verificaId(id);
        BeanUtils.copyProperties(endereco, u, "id");
        return enderecoRepository.save(u);
    }

    public void deletar (Integer id){
        Endereco enderecoId = verificaId(id);
        enderecoRepository.deleteById(enderecoId.getId_endereco());
    }

    public Endereco verificaId (Integer id){
        Endereco endereco = buscarPorId(id);
        return endereco;
    }

}
