package com.cwdegidio.gmbinder.repositories;

import com.cwdegidio.gmbinder.models.entities.PlayerCharacterEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayerCharacterRepository extends JpaRepository<PlayerCharacterEntity, Long> {

    @EntityGraph(attributePaths = {"attributesEntity","languages"})
    @Override
    Optional<PlayerCharacterEntity> findById(Long id);
}
