package com.vicio.appvicio.service;

import com.vicio.appvicio.model.Feedback;
import com.vicio.appvicio.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.dao.EmptyResultDataAccessException;


import java.util.List;
import java.util.Optional;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public List<Feedback> listarTodos () {
        return feedbackRepository.findAll();
    }

    public Optional<Feedback> buscarPorId (Integer id) {
        return feedbackRepository.findById(id);
    }

    public Feedback salvarfeedback (Feedback feedback){
        return feedbackRepository.save(feedback);
    }

    public Feedback atualizarfeedback (Integer id, Feedback feedback){
        Feedback u = verificaId(id);
        BeanUtils.copyProperties(feedback, u, "id");
        return feedbackRepository.save(u);
    }

    public void deletar (Integer id){
        feedbackRepository.deleteById(id);
    }

    public Feedback verificaId (Integer id){
        Optional<Feedback> feedback = buscarPorId(id);
        if (!feedback.isPresent()){
            throw  new EmptyResultDataAccessException(1);
        }
        return feedback.get();
    }
}
