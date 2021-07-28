package com.vicio.appVicio.service;

import com.vicio.appVicio.model.UsuarioTrofeu;
import com.vicio.appVicio.repository.UsuarioTrofeuRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioTrofeuService {

    @Autowired
    private UsuarioTrofeuRepository usuarioTrofeuRepository;

    public List<UsuarioTrofeu> listarTodos () {
        return usuarioTrofeuRepository.findAll();
    }

    public Optional<UsuarioTrofeu> buscarPorId (Integer id) {
        return usuarioTrofeuRepository.findById(id);
    }

    public UsuarioTrofeu buscaIdUsuarioTipoNivel (Integer id_usuario, Integer id_tipo, Integer id_nivel) {
        return usuarioTrofeuRepository.buscaIdUsuarioTipoNivel(id_usuario, id_tipo, id_nivel);
    }

    public UsuarioTrofeu buscaIdUsuarioTipo (Integer id_usuario, Integer id_tipo) {
        return usuarioTrofeuRepository.buscaIdUsuarioTipo(id_usuario, id_tipo);
    }

    public UsuarioTrofeu buscaIdUsuarioNivel (Integer id_usuario, Integer id_nivel) {
        return usuarioTrofeuRepository.buscaIdUsuarioNivel(id_usuario, id_nivel);
    }

    public UsuarioTrofeu salvarUsuarioTrofeu (UsuarioTrofeu usuarioTrofeu){
        return usuarioTrofeuRepository.save(usuarioTrofeu);
    }

    public UsuarioTrofeu atualizarUsuarioTrofeu (Integer id, UsuarioTrofeu usuarioTrofeu){
        UsuarioTrofeu u = verificaId(id);
        BeanUtils.copyProperties(usuarioTrofeu, u, "id");
        return usuarioTrofeuRepository.save(u);
    }

    public void deletar (Integer id){
        usuarioTrofeuRepository.deleteById(id);
    }

    public UsuarioTrofeu verificaId (Integer id){
        Optional<UsuarioTrofeu> usuarioTrofeu = buscarPorId(id);
        if (!usuarioTrofeu.isPresent()){
            throw  new EmptyResultDataAccessException(1);
        }
        return usuarioTrofeu.get();
    }
}
