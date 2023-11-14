package com.lucasdevsuperior.dslist.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasdevsuperior.dslist.dto.GameMinDTO;
import com.lucasdevsuperior.dslist.services.GameServices;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameServices gameServices;
 
    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameServices.findAll();
        return result;
    }
}
