package com.cwdegidio.gmbinder.models.entities;

import com.cwdegidio.gmbinder.enums.Alignment;
import com.cwdegidio.gmbinder.enums.CharacterClass;
import jakarta.persistence.*;

@Entity
@Table(name = "PLAYER_CHARACTER")
public class PlayerCharacterEntity {

    @Id
    @SequenceGenerator(
            name = "player_character_sequence",
            sequenceName = "player_character_sequence",
            initialValue = 100,
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "player_character_sequence"
    )
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CharacterClass characterClass;

    @Column(nullable = true)
    private String title;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Alignment alignment;

    @Column(nullable = false)
    private int level;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false, name = "stats_id", referencedColumnName = "id")
    private AttributesEntity attributesEntity;

    @Column(nullable = false, name = "max_hp")
    private int maxHitPoints;

    // TODO: Languages / Literacy

    public PlayerCharacterEntity() {
    }

    public PlayerCharacterEntity(String name, CharacterClass characterClass, String title, Alignment alignment, int level,
                                 AttributesEntity stats, int maxHitPoints) {
        this.name = name;
        this.characterClass = characterClass;
        this.title = title;
        this.alignment = alignment;
        this.level = level;
        this.attributesEntity = stats;
        this.maxHitPoints = maxHitPoints;
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

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public AttributesEntity getAttributes() {
        return attributesEntity;
    }

    public void setAttributes(AttributesEntity attributesEntity) {
        this.attributesEntity = attributesEntity;
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public void setMaxHitPoints(int maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
    }
}
