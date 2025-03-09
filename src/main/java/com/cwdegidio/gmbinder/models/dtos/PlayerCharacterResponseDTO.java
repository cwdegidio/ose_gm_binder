package com.cwdegidio.gmbinder.models.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record PlayerCharacterResponseDTO(
        @JsonProperty long id,
        @JsonProperty String name,
        @JsonProperty("character_class") String characterClass,
        @JsonProperty String alignment,
        @JsonProperty String title,
        @JsonProperty int level,
        @JsonProperty("max_hp") int maximumHitPoints,
        @JsonProperty AttributesDTO attributes,
        @JsonProperty String literacy,
        @JsonProperty List<String> languages
) {
}
