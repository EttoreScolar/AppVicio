package com.vicio.appvicio.service;

import com.vicio.appvicio.model.Endereco;
import com.vicio.appvicio.repository.EnderecoRepository;
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

    public Optional<Endereco> buscarPorId (Integer id) {
        return enderecoRepository.findById(id);
    }

    public Endereco salvarendereco (Endereco endereco){
        return enderecoRepository.save(endereco);
    }

    public Endereco atualizarendereco (Integer id, Endereco endereco){
        Endereco u = verificaId(id);
        BeanUtils.copyProperties(endereco, u, "id");
        return enderecoRepository.save(u);
    }

    public void deletar (Integer id){
        enderecoRepository.deleteById(id);
    }

    public Endereco verificaId (Integer id){
        Optional<Endereco> endereco = buscarPorId(id);
        if (!endereco.isPresent()){
            throw  new EmptyResultDataAccessException(1);
        }
        return endereco.get();
    }

}
