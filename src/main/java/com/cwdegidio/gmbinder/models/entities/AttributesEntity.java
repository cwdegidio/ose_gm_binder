package com.cwdegidio.gmbinder.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ATTRIBUTES")
public class AttributesEntity {

    @Id
    @SequenceGenerator(
            name = "attributes_sequence",
            sequenceName = "attributes_sequence",
            initialValue = 100,
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "attributes_sequence"
    )
    private long id;

    @Column(nullable = false, name = "str")
    private int strength;

    @Column(nullable = false, name = "dex")
    private int dexterity;

    @Column(nullable = false, name = "con")
    private int constitution;

    @Column(nullable = false, name = "wis")
    private int wisdom;

    @Column(nullable = false, name = "int")
    private int intelligence;

    @Column(nullable = false, name = "cha")
    private int charisma;

    @OneToOne(mappedBy = "attributesEntity")
    private PlayerCharacterEntity playerCharacterEntity;

    public AttributesEntity() {
    }

    public AttributesEntity(
            long id, int strength, int dexterity, int constitution, int wisdom,
            int intelligence, int charisma, PlayerCharacterEntity playerCharacterEntity
    ) {
        this.id = id;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.wisdom = wisdom;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.playerCharacterEntity = playerCharacterEntity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public PlayerCharacterEntity getPlayerCharacter() {
        return playerCharacterEntity;
    }

    public void setPlayerCharacter(PlayerCharacterEntity playerCharacterEntity) {
        this.playerCharacterEntity = playerCharacterEntity;
    }
}
