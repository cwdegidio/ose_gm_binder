package com.cwdegidio.gmbinder.models.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "language")
public class LanguageEntity {

    @Id
    @SequenceGenerator(
            name = "languages_sequence",
            sequenceName = "languages_sequence",
            initialValue = 100,
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "languages_sequence"
    )
    private long id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "languages")
    private List<PlayerCharacterEntity> playerCharacters;


    public LanguageEntity() {
    }

    public LanguageEntity(String name) {
        this.name = name;
    }

    public LanguageEntity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public LanguageEntity(long id, String name, List<PlayerCharacterEntity> playerCharacters) {
        this.id = id;
        this.name = name;
        this.playerCharacters = playerCharacters;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PlayerCharacterEntity> getPlayerCharacters() {
        return playerCharacters;
    }

    public void setPlayerCharacters(List<PlayerCharacterEntity> playerCharacters) {
        this.playerCharacters = playerCharacters;
    }
}
