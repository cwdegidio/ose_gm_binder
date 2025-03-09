package com.cwdegidio.gmbinder.models;

import com.cwdegidio.gmbinder.utils.AttributeBonuses;

import java.util.Map;

public class Attributes {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Attributes() {
    }

    public Attributes(int strength, int dexterity, int constitution,
                          int intelligence, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public int getStrength() {
        return strength;
    }

    public Map<String, Integer> getStrengthBonus() {
        return AttributeBonuses.getStrengthBonus(strength);
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public Map<String, Integer> getDexterityBonus() {
        return AttributeBonuses.getDexterityBonus(dexterity);
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public Map<String, Integer> getConstitutionBonus() {
        return AttributeBonuses.getConstitutionBonus(constitution);
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public Map<String, Integer> getIntelligenceBonus(int intelligence) {
        return AttributeBonuses.getIntelligenceBonus(intelligence);
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public Map<String, Integer> getWisdomBonus() {
        return AttributeBonuses.getWisdomBonus(wisdom);
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public Map<String, Integer> getCharismaBonus() {
        return AttributeBonuses.getCharismaBonus(charisma);
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
}
