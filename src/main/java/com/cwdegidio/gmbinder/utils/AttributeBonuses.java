package com.cwdegidio.gmbinder.utils;

import java.util.HashMap;
import java.util.Map;

public class AttributeBonuses {

    public static Map<String, Integer> getStrengthBonus(int score) {
        Map<String, Integer> bonuses = new HashMap<>();
        bonuses.put("melee", 0);
        bonuses.put("open_doors", 2);

        if (score == 3) {
            bonuses.put("melee", -3);
            bonuses.put("open_doors", 1);
        } else if (MathUtil.betweenInclusive(4, 5, score)) {
            bonuses.put("melee", -2);
            bonuses.put("open_doors", 1);
        } else if (MathUtil.betweenInclusive(6, 8, score)) {
            bonuses.put("melee", -1);
            bonuses.put("open_doors", 1);
        } else if (MathUtil.betweenInclusive(13, 15, score)) {
            bonuses.put("melee", 1);
            bonuses.put("open_doors", 3);
        } else if (MathUtil.betweenInclusive(16, 17, score)) {
            bonuses.put("melee", 2);
            bonuses.put("open_doors", 4);
        } else if (score == 18) {
            bonuses.put("melee", 3);
            bonuses.put("open_doors", 5);
        }

        return bonuses;
    }

    public static Map<String, Integer> getDexterityBonus(int score) {
        Map<String, Integer> bonuses = new HashMap<>();
        bonuses.put("ac", 0);
        bonuses.put("missile", 0);
        bonuses.put("initiative", 0);

        if (score == 3) {
            bonuses.put("ac", -3);
            bonuses.put("missile", -3);
            bonuses.put("initiative", -2);
        } else if (MathUtil.betweenInclusive(4, 5, score)) {
            bonuses.put("ac", -2);
            bonuses.put("missile", -2);
            bonuses.put("initiative", -1);
        } else if (MathUtil.betweenInclusive(6, 8, score)) {
            bonuses.put("ac", -1);
            bonuses.put("missile", -1);
            bonuses.put("initiative", -1);
        } else if (MathUtil.betweenInclusive(13, 15, score)) {
            bonuses.put("ac", 1);
            bonuses.put("missile", 1);
            bonuses.put("initiative", 1);
        } else if (MathUtil.betweenInclusive(16, 17, score)) {
            bonuses.put("ac", 2);
            bonuses.put("missile", 2);
            bonuses.put("initiative", 1);
        } else if (score == 18) {
            bonuses.put("ac", 3);
            bonuses.put("missile", 3);
            bonuses.put("initiative", 2);
        }

        return bonuses;
    }

    public static Map<String, Integer> getConstitutionBonus(int score) {
        Map<String, Integer> bonuses = new HashMap<>();
        bonuses.put("hp", 0);

        if (score == 3) {
            bonuses.put("hp", -3);
        } else if (MathUtil.betweenInclusive(4, 5, score)) {
            bonuses.put("hp", -2);
        } else if (MathUtil.betweenInclusive(6, 8, score)) {
            bonuses.put("hp", -1);
        } else if (MathUtil.betweenInclusive(13, 15, score)) {
            bonuses.put("hp", 1);
        } else if (MathUtil.betweenInclusive(16, 17, score)) {
            bonuses.put("hp", 2);
        } else if (score == 18) {
            bonuses.put("hp", 3);
        }

        return bonuses;
    }

    public static Map<String, Integer> getWisdomBonus(int score) {
        Map<String, Integer> bonuses = new HashMap<>();
        bonuses.put("magic_saves", 0);

        if (score == 3) {
            bonuses.put("magic_saves", -3);
        } else if (MathUtil.betweenInclusive(4, 5, score)) {
            bonuses.put("magic_saves", -2);
        } else if (MathUtil.betweenInclusive(6, 8, score)) {
            bonuses.put("magic_saves", -1);
        } else if (MathUtil.betweenInclusive(13, 15, score)) {
            bonuses.put("magic_saves", 1);
        } else if (MathUtil.betweenInclusive(16, 17, score)) {
            bonuses.put("magic_saves", 2);
        } else if (score == 18) {
            bonuses.put("magic_saves", 3);
        }

        return bonuses;
    }

    public static Map<String, Integer> getIntelligenceBonus(int score) {
        Map<String, Integer> bonuses = new HashMap<>();
        bonuses.put("spoken_languages", 1);
        bonuses.put("literacy", 1);

        if (score == 3) {
            bonuses.put("spoken_languages", -1);
            bonuses.put("literacy", -1);
        } else if (MathUtil.betweenInclusive(4, 5, score)) {
            bonuses.put("spoken_languages", 1);
            bonuses.put("literacy", -1);
        } else if (MathUtil.betweenInclusive(6, 8, score)) {
            bonuses.put("spoken_languages", 1);
            bonuses.put("literacy", 0);
        } else if (MathUtil.betweenInclusive(13, 15, score)) {
            bonuses.put("spoken_languages", 2);
            bonuses.put("literacy", 1);
        } else if (MathUtil.betweenInclusive(16, 17, score)) {
            bonuses.put("spoken_languages", 3);
            bonuses.put("literacy", 1);
        } else if (score == 18) {
            bonuses.put("spoken_languages", 4);
            bonuses.put("literacy", 1);
        }

        return bonuses;
    }

    public static Map<String, Integer> getCharismaBonus(int score) {
        Map<String, Integer> bonuses = new HashMap<>();
        bonuses.put("npc_reactions", 0);
        bonuses.put("retainers_max", 4);
        bonuses.put("retainers_loyalty", 7);

        if (score == 3) {
            bonuses.put("npc_reactions", -2);
            bonuses.put("retainers_max", 1);
            bonuses.put("retainers_loyalty", 4);
        } else if (MathUtil.betweenInclusive(4, 5, score)) {
            bonuses.put("npc_reactions", -1);
            bonuses.put("retainers_max", 2);
            bonuses.put("retainers_loyalty", 5);
        } else if (MathUtil.betweenInclusive(6, 8, score)) {
            bonuses.put("npc_reactions", -1);
            bonuses.put("retainers_max", 3);
            bonuses.put("retainers_loyalty", 6);
        } else if (MathUtil.betweenInclusive(13, 15, score)) {
            bonuses.put("npc_reactions", 1);
            bonuses.put("retainers_max", 5);
            bonuses.put("retainers_loyalty", 8);
        } else if (MathUtil.betweenInclusive(16, 17, score)) {
            bonuses.put("npc_reactions", 1);
            bonuses.put("retainers_max", 6);
            bonuses.put("retainers_loyalty", 9);
        } else if (score == 18) {
            bonuses.put("npc_reactions", 2);
            bonuses.put("retainers_max", 7);
            bonuses.put("retainers_loyalty", 10);
        }

        return bonuses;
    }

}
