package com.cwdegidio.gmbinder.models;

import com.cwdegidio.gmbinder.enums.Alignment;
import com.cwdegidio.gmbinder.enums.CharacterClass;

import java.util.List;
import java.util.Map;

public class PlayerCharacter {

    private long id;
    private String name;
    private CharacterClass characterClass;
    private Alignment alignment;
    private Attributes attributes;
    private int level;
    private int maximumHitPoints;
    private List<String> languages;

    public PlayerCharacter() {
    }

    public PlayerCharacter(long id, String name, CharacterClass characterClass, Alignment alignment,
                           Attributes attributes, int level, int maximumHitPoints, List<String> languages) {
        this.id = id;
        this.name = name;
        this.characterClass = characterClass;
        this.alignment = alignment;
        this.attributes = attributes;
        this.level = level;
        this.maximumHitPoints = maximumHitPoints;
        this.languages = languages;
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

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaximumHitPoints() {
        return maximumHitPoints;
    }

    public void setMaximumHitPoints(int maximumHitPoints) {
        this.maximumHitPoints = maximumHitPoints;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public Integer getWisdomBonusForSaveVsMagic() {
        return attributes.getWisdomBonus().get("magic_saves");
    }

    public Integer getStrengthModifierForMelee() {
        return attributes.getStrengthBonus().get("melee");
    }

    public Integer getConstitutionModifierForHitPoints() {
        return attributes.getConstitutionBonus().get("hit_points");
    }

    public Integer getUnarmoredArmorClass() {
        return 9 + attributes.getDexterityBonus().get("armor_class");
    }

    public Integer getDexterityModifierForArmorClass() {
        return attributes.getDexterityBonus().get("armor_class");
    }

    public Integer getDexterityModifierForInitiative() {
        return attributes.getDexterityBonus().get("initiative");
    }

    public Integer getCharismaModifierForReactions() {
        return attributes.getCharismaBonus().get("reactions");
    }

    public String getLiteracy() {
        int literacyValue = attributes.getIntelligenceBonus().get("literacy");

        if (literacyValue == -1) {
            return "Illiterate";
        } else if (literacyValue == 1) {
            return "Literate";
        }

        return "Basic";
    }

    public int getListenAtDoors() {
        return 1; // TODO: Doors - Some classes have better odds
    }

    public int getOpenStuckDoors() {
        return attributes.getStrengthBonus().get("open_doors");
    }

    public int getFindTraps() {
        return 1; // TODO: Traps - Some classes have better odds
    }

    public Map<String, Integer> getMovementRates() {
        int base = 120;
        int overland = base / 5;
        int encounter = base / 3;

        return Map.of(
                "overland",
                overland,
                "exploration",
                base,
                "encounter",
                encounter
        );
    }
}
