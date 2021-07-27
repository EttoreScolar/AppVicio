package com.vicio.appVicio.service;

import com.vicio.appVicio.model.Imagem;
import com.vicio.appVicio.repository.ImagemRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImagemService {

    @Autowired
    private ImagemRepository imagemRepository;

    public List<Imagem> listarTodos () {
        return imagemRepository.findAll();
    }

    public Optional<Imagem> buscarPorId (Integer id) {
        return imagemRepository.findById(id);
    }

    public Imagem salvarimagem (Imagem imagem){
        return imagemRepository.save(imagem);
    }

    public Imagem atualizarimagem (Integer id, Imagem imagem){
        Imagem u = verificaId(id);
        BeanUtils.copyProperties(imagem, u, "id");
        return imagemRepository.save(u);
    }

    public void deletar (Integer id){
        imagemRepository.deleteById(id);
    }

    public Imagem verificaId (Integer id){
        Optional<Imagem> imagem = buscarPorId(id);
        if (!imagem.isPresent()){
            throw  new EmptyResultDataAccessException(1);
        }
        return imagem.get();
    }
}
