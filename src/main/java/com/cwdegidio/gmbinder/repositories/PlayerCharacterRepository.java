package com.cwdegidio.gmbinder.repositories;

import com.cwdegidio.gmbinder.models.entities.PlayerCharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerCharacterRepository extends JpaRepository<PlayerCharacterEntity, Long> {
}
