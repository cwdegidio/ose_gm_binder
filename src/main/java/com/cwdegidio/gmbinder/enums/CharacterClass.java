package com.cwdegidio.gmbinder.enums;

public enum CharacterClass {
    CLERIC("Cleric"),
    DWARF("Dwarf"),
    ELF("Elf"),
    FIGHTER("Fighter"),
    HALFLING("Halfling"),
    MAGIC_USER("Magic-User"),
    THIEF("Thief");

    private final String name;

    CharacterClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
