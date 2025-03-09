package com.cwdegidio.gmbinder.services.impls;

import com.cwdegidio.gmbinder.models.Attributes;
import com.cwdegidio.gmbinder.models.PlayerCharacter;
import com.cwdegidio.gmbinder.models.entities.LanguageEntity;
import com.cwdegidio.gmbinder.models.entities.PlayerCharacterEntity;
import com.cwdegidio.gmbinder.repositories.PlayerCharacterRepository;
import com.cwdegidio.gmbinder.services.interfaces.PlayerCharacterService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerCharacterServiceImpl implements PlayerCharacterService {
    
    private final PlayerCharacterRepository pcRepository;

    public PlayerCharacterServiceImpl(PlayerCharacterRepository pcRepository) {
        this.pcRepository = pcRepository;
    }

    @Override
    public PlayerCharacter getCharacterById(long id) {
        PlayerCharacterEntity playerEntity = pcRepository.findById(id).orElse(null);
        final Attributes attributes = getAttributes(playerEntity);

        return setPlayerCharacter(playerEntity, attributes);
    }

    private static Attributes getAttributes(PlayerCharacterEntity playerEntity) {
        Attributes characterStats = new Attributes();
        characterStats.setStrength(playerEntity.getAttributes().getStrength());
        characterStats.setDexterity(playerEntity.getAttributes().getDexterity());
        characterStats.setConstitution(playerEntity.getAttributes().getConstitution());
        characterStats.setIntelligence(playerEntity.getAttributes().getIntelligence());
        characterStats.setWisdom(playerEntity.getAttributes().getWisdom());
        characterStats.setCharisma(playerEntity.getAttributes().getCharisma());

        return characterStats;
    }

    private static PlayerCharacter setPlayerCharacter(PlayerCharacterEntity pcEntity, Attributes attributes) {
        PlayerCharacter character = new PlayerCharacter();
        character.setId(pcEntity.getId());
        character.setName(pcEntity.getName());
        character.setCharacterClass(pcEntity.getCharacterClass());
        character.setAlignment(pcEntity.getAlignment());
        character.setAttributes(attributes);
        character.setLevel(pcEntity.getLevel());
        character.setMaximumHitPoints(pcEntity.getMaxHitPoints());
        character.setLanguages(pcEntity.getLanguages().stream().map(LanguageEntity::getName).collect(Collectors.toList()));
        return character;
    }
}
