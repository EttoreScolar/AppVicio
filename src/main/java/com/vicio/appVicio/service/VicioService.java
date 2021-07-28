package com.vicio.appVicio.service;

import com.vicio.appVicio.model.Vicio;
import com.vicio.appVicio.repository.VicioRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VicioService {

    @Autowired
    private VicioRepository vicioRepository;

    public List<Vicio> listarTodos () {
        return vicioRepository.findAll();
    }

    public Optional<Vicio> buscarPorId (Integer id) {
        return vicioRepository.findById(id);
    }

    public Vicio buscaIdUsuario (Integer id) {
        return vicioRepository.buscaIdUsuario(id);
    }

    public Vicio salvarvicio (Vicio vicio){
        return vicioRepository.save(vicio);
    }

    public Vicio atualizarvicio (Integer id, Vicio vicio){
        Vicio u = verificaId(id);
        BeanUtils.copyProperties(vicio, u, "id");
        return vicioRepository.save(u);
    }

    public void deletar (Integer id){
        vicioRepository.deleteById(id);
    }

    public Vicio verificaId (Integer id){
        Optional<Vicio> vicio = buscarPorId(id);
        if (!vicio.isPresent()){
            throw  new EmptyResultDataAccessException(1);
        }
        return vicio.get();
    }
}
