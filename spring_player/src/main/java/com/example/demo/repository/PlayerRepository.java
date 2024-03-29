package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PlayerEntity;

/**
 * 選手情報 Repository
 */
@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {
	
}