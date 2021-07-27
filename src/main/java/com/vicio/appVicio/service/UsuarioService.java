package com.vicio.appVicio.service;

import com.vicio.appVicio.model.Usuario;
import com.vicio.appVicio.repository.UsuarioRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarTodos () {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscarPorId (Integer id) {
        return usuarioRepository.findById(id);
    }

    public Usuario salvarUsuario (Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizarUsuario (Integer id, Usuario usuario){
        Usuario u = verificaId(id);
        BeanUtils.copyProperties(usuario, u, "id");
        return usuarioRepository.save(u);
    }

    public void deletar (Integer id){
        usuarioRepository.deleteById(id);
    }

    public Usuario verificaId (Integer id){
        Optional<Usuario> usuario = buscarPorId(id);
        if (!usuario.isPresent()){
            throw  new EmptyResultDataAccessException(1);
        }
        return usuario.get();
    }

}
