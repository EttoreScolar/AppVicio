package com.vicio.appvicio.service;

import com.vicio.appvicio.model.Trofeu;
import com.vicio.appvicio.repository.TrofeuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
