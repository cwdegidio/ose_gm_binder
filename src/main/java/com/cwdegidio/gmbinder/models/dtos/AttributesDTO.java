package com.cwdegidio.gmbinder.models.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AttributesDTO (
    @JsonProperty int strength,
    @JsonProperty int dexterity,
    @JsonProperty int constitution,
    @JsonProperty int intelligence,
    @JsonProperty int wisdom,
    @JsonProperty int charisma
) {

}
