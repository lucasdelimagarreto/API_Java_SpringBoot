package com.lucasdevsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdevsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
