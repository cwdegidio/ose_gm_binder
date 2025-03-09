package com.cwdegidio.gmbinder.enums;

public enum Alignment {
    LAW("Law"),
    NEUTRALITY("Neutrality"),
    CHAOS("Chaos");

    private final String name;

    Alignment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
