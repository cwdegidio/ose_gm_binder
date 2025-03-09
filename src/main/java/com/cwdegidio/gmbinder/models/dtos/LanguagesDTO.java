package com.cwdegidio.gmbinder.models.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record LanguagesDTO(
        List<String> languages
) {

}
