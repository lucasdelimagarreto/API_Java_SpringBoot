package com.lucasdevsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasdevsuperior.dslist.dto.GameMinDTO;
import com.lucasdevsuperior.dslist.entities.Game;
import com.lucasdevsuperior.dslist.repositories.GameRepository;

@Service
public class GameServices {
    
    @Autowired
    private GameRepository gameRepository;
    
    public List<GameMinDTO> findAll(){
        List<Game> result =  gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
