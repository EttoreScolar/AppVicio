package com.vicio.appVicio.service;

import com.vicio.appVicio.model.UsuarioImagem;
import com.vicio.appVicio.repository.UsuarioImagemRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioImagemService {

    @Autowired
    private UsuarioImagemRepository usuarioImagemRepository;

    public List<UsuarioImagem> listarTodos () {
        return usuarioImagemRepository.findAll();
    }

    public Optional<UsuarioImagem> buscarPorId (Integer id) {
        return usuarioImagemRepository.findById(id);
    }

    public UsuarioImagem salvarUsuarioImagem (UsuarioImagem usuarioImagem){
        return usuarioImagemRepository.save(usuarioImagem);
    }

    public UsuarioImagem atualizarUsuarioImagem (Integer id, UsuarioImagem usuarioImagem){
        UsuarioImagem u = verificaId(id);
        BeanUtils.copyProperties(usuarioImagem, u, "id");
        return usuarioImagemRepository.save(u);
    }

    public void deletar (Integer id){
        usuarioImagemRepository.deleteById(id);
    }

    public UsuarioImagem verificaId (Integer id){
        Optional<UsuarioImagem> usuarioImagem = buscarPorId(id);
        if (!usuarioImagem.isPresent()){
            throw  new EmptyResultDataAccessException(1);
        }
        return usuarioImagem.get();
    }
}
