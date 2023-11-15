package com.lucasdevsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasdevsuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
