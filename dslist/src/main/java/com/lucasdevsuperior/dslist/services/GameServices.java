package com.lucasdevsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucasdevsuperior.dslist.dto.GameDTO;
import com.lucasdevsuperior.dslist.dto.GameMinDTO;
import com.lucasdevsuperior.dslist.entities.Game;
import com.lucasdevsuperior.dslist.repositories.GameRepository;



@Service
public class GameServices {
    
    @Autowired
    private GameRepository gameRepository;
    
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();// aplicar tratamento de exceções para o caso de o ID não existir
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result =  gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    
}