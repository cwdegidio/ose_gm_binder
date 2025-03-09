package com.cwdegidio.gmbinder.models.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PlayerCharacterResponseDTO(
        @JsonProperty long id,
        @JsonProperty String name,
        @JsonProperty("character_class") String characterClass,
        @JsonProperty String alignment,
        @JsonProperty String title,
        @JsonProperty int level,
        @JsonProperty("max_hp") int maximumHitPoints,
        @JsonProperty("attributes") AttributesDTO stats
) {
}
