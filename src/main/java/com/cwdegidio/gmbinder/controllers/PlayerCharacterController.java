package com.cwdegidio.gmbinder.controllers;

import com.cwdegidio.gmbinder.models.PlayerCharacter;
import com.cwdegidio.gmbinder.models.dtos.AttributesDTO;
import com.cwdegidio.gmbinder.models.dtos.LanguagesDTO;
import com.cwdegidio.gmbinder.models.dtos.PlayerCharacterResponseDTO;
import com.cwdegidio.gmbinder.repositories.PlayerCharacterRepository;
import com.cwdegidio.gmbinder.services.interfaces.PlayerCharacterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/player")
public class PlayerCharacterController {
    private final PlayerCharacterRepository pcRepository;
    private final PlayerCharacterService pcService;

    public PlayerCharacterController(PlayerCharacterRepository pcRepository, PlayerCharacterService pcService) {
        this.pcRepository = pcRepository;
        this.pcService = pcService;
    }

    @GetMapping("/{pcId}")
    public ResponseEntity<PlayerCharacterResponseDTO> getPlayerCharacter(@PathVariable(value = "pcId") String id) {
        PlayerCharacter playerCharacter = pcService.getCharacterById(Long.parseLong(id));
        AttributesDTO attributesDTO = new AttributesDTO(
                playerCharacter.getAttributes().getStrength(),
                playerCharacter.getAttributes().getDexterity(),
                playerCharacter.getAttributes().getConstitution(),
                playerCharacter.getAttributes().getIntelligence(),
                playerCharacter.getAttributes().getWisdom(),
                playerCharacter.getAttributes().getCharisma()
        );

        LanguagesDTO languagesDTO = new LanguagesDTO(playerCharacter.getLanguages());

        PlayerCharacterResponseDTO responsePlayerCharacterDTO = new PlayerCharacterResponseDTO(
                playerCharacter.getId(),
                playerCharacter.getName(),
                playerCharacter.getCharacterClass().toString(),
                playerCharacter.getAlignment().toString(),
                "",
                playerCharacter.getLevel(),
                playerCharacter.getMaximumHitPoints(),
                attributesDTO,
                playerCharacter.getLiteracy(),
                languagesDTO.languages()
        );

        return ResponseEntity.ok(responsePlayerCharacterDTO);
    }
}
