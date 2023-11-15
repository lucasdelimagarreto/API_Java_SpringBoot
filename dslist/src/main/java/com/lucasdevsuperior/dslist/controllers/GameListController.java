package com.lucasdevsuperior.dslist.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasdevsuperior.dslist.dto.GameListDTO;
import com.lucasdevsuperior.dslist.dto.GameMinDTO;
import com.lucasdevsuperior.dslist.services.GameListServices;
import com.lucasdevsuperior.dslist.services.GameServices;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListServices gameListServices;

    @Autowired
    private GameServices gameServices;
 
    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListServices.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameServices.findByList(listId);
        return result;
    }
}