package com.vicio.appVicio.service;

import com.vicio.appVicio.model.Trofeu;
import com.vicio.appVicio.repository.TrofeuRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrofeuService {

    @Autowired
    private TrofeuRepository trofeuRepository;

    public List<Trofeu> listarTodos () {
        return trofeuRepository.findAll();
    }

    public Trofeu salvarTrofeu (Trofeu Trofeu){
        return trofeuRepository.save(Trofeu);
    }

    public Trofeu atualizarTrofeu (Integer id, Trofeu trofeu){
        return trofeuRepository.save(trofeu);
    }

    public void deletar (Integer id){
        trofeuRepository.deleteById(id);
    }

}
