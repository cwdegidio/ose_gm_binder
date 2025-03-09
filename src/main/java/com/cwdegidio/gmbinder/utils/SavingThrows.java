package com.cwdegidio.gmbinder.utils;

import com.cwdegidio.gmbinder.enums.CharacterClass;

import java.util.HashMap;
import java.util.Map;

public class SavingThrows {

    public static Map<String, Integer> getSavingThrows(CharacterClass characterClass, Integer level) {
        return switch (characterClass) {
            case CLERIC -> getClericSavingThrows(level);
            case DWARF -> getDwarfSavingThrows(level);
            case ELF -> getElfSavingThrows(level);
            case HALFLING -> getHalflingSavingThrows(level);
            case MAGIC_USER -> getMagicUserSavingThrows(level);
            case THIEF -> getThiefSavingThrows(level);
            default -> getFighterSavingThrows(level);
        };
    }

    private static Map<String, Integer> getClericSavingThrows(Integer level) {
        Map<String, Integer> savingThrows = new HashMap<>();
        savingThrows.put("death", 11);
        savingThrows.put("wands", 12);
        savingThrows.put("paralysis", 14);
        savingThrows.put("breath", 16);
        savingThrows.put("spells", 15);

        if (MathUtil.betweenInclusive(5, 8, level)) {
            savingThrows.put("death", 9);
            savingThrows.put("wands", 10);
            savingThrows.put("paralysis", 12);
            savingThrows.put("breath", 14);
            savingThrows.put("spells", 12);
        } else if (MathUtil.betweenInclusive(9, 12, level)) {
            savingThrows.put("death", 6);
            savingThrows.put("wands", 7);
            savingThrows.put("paralysis", 9);
            savingThrows.put("breath", 11);
            savingThrows.put("spells", 9);
        } else if (MathUtil.betweenInclusive(13, 14, level)) {
            savingThrows.put("death", 3);
            savingThrows.put("wands", 5);
            savingThrows.put("paralysis", 7);
            savingThrows.put("breath", 8);
            savingThrows.put("spells", 7);
        }

        return savingThrows;
    }

    private static Map<String, Integer> getDwarfSavingThrows(Integer level) {
        Map<String, Integer> savingThrows = new HashMap<>();
        savingThrows.put("death", 8);
        savingThrows.put("wands", 9);
        savingThrows.put("paralysis", 10);
        savingThrows.put("breath", 13);
        savingThrows.put("spells", 12);

        if (MathUtil.betweenInclusive(4, 6, level)) {
            savingThrows.put("death", 6);
            savingThrows.put("wands", 7);
            savingThrows.put("paralysis", 8);
            savingThrows.put("breath", 10);
            savingThrows.put("spells", 10);
        } else if (MathUtil.betweenInclusive(7, 9, level)) {
            savingThrows.put("death", 4);
            savingThrows.put("wands", 5);
            savingThrows.put("paralysis", 6);
            savingThrows.put("breath", 7);
            savingThrows.put("spells", 8);
        } else if (MathUtil.betweenInclusive(10, 12, level)) {
            savingThrows.put("death", 2);
            savingThrows.put("wands", 3);
            savingThrows.put("paralysis", 4);
            savingThrows.put("breath", 4);
            savingThrows.put("spells", 6);
        }

        return savingThrows;
    }

    private static Map<String, Integer> getElfSavingThrows(Integer level) {
        Map<String, Integer> savingThrows = new HashMap<>();
        savingThrows.put("death", 12);
        savingThrows.put("wands", 13);
        savingThrows.put("paralysis", 13);
        savingThrows.put("breath", 15);
        savingThrows.put("spells", 15);

        if (MathUtil.betweenInclusive(4, 6, level)) {
            savingThrows.put("death", 10);
            savingThrows.put("wands", 11);
            savingThrows.put("paralysis", 11);
            savingThrows.put("breath", 13);
            savingThrows.put("spells", 12);
        } else if (MathUtil.betweenInclusive(7, 9, level)) {
            savingThrows.put("death", 8);
            savingThrows.put("wands", 9);
            savingThrows.put("paralysis", 9);
            savingThrows.put("breath", 10);
            savingThrows.put("spells", 10);
        } else if (level == 10) {
            savingThrows.put("death", 6);
            savingThrows.put("wands", 7);
            savingThrows.put("paralysis", 8);
            savingThrows.put("breath", 8);
            savingThrows.put("spells", 8);
        }

        return savingThrows;
    }

    private static Map<String, Integer> getHalflingSavingThrows(Integer level) {
        Map<String, Integer> savingThrows = new HashMap<>();
        savingThrows.put("death", 8);
        savingThrows.put("wands", 9);
        savingThrows.put("paralysis", 10);
        savingThrows.put("breath", 13);
        savingThrows.put("spells", 12);

        if (MathUtil.betweenInclusive(4, 6, level)) {
            savingThrows.put("death", 6);
            savingThrows.put("wands", 7);
            savingThrows.put("paralysis", 8);
            savingThrows.put("breath", 10);
            savingThrows.put("spells", 10);
        } else if (MathUtil.betweenInclusive(7, 8, level)) {
            savingThrows.put("death", 4);
            savingThrows.put("wands", 5);
            savingThrows.put("paralysis", 6);
            savingThrows.put("breath", 7);
            savingThrows.put("spells", 8);
        }

        return savingThrows;
    }

    private static Map<String, Integer> getMagicUserSavingThrows(Integer level) {
        Map<String, Integer> savingThrows = new HashMap<>();
        savingThrows.put("death", 13);
        savingThrows.put("wands", 14);
        savingThrows.put("paralysis", 13);
        savingThrows.put("breath", 16);
        savingThrows.put("spells", 15);

        if (MathUtil.betweenInclusive(6, 10, level)) {
            savingThrows.put("death", 11);
            savingThrows.put("wands", 12);
            savingThrows.put("paralysis", 11);
            savingThrows.put("breath", 14);
            savingThrows.put("spells", 12);
        } else if (MathUtil.betweenInclusive(11, 14, level)) {
            savingThrows.put("death", 8);
            savingThrows.put("wands", 9);
            savingThrows.put("paralysis", 8);
            savingThrows.put("breath", 11);
            savingThrows.put("spells", 8);
        }

        return savingThrows;
    }

    private static Map<String, Integer> getThiefSavingThrows(Integer level) {
        Map<String, Integer> savingThrows = new HashMap<>();
        savingThrows.put("death", 13);
        savingThrows.put("wands", 14);
        savingThrows.put("paralysis", 13);
        savingThrows.put("breath", 16);
        savingThrows.put("spells", 15);

        if (MathUtil.betweenInclusive(5, 8, level)) {
            savingThrows.put("death", 12);
            savingThrows.put("wands", 13);
            savingThrows.put("paralysis", 11);
            savingThrows.put("breath", 14);
            savingThrows.put("spells", 13);
        } else if (MathUtil.betweenInclusive(9, 12, level)) {
            savingThrows.put("death", 10);
            savingThrows.put("wands", 11);
            savingThrows.put("paralysis", 9);
            savingThrows.put("breath", 12);
            savingThrows.put("spells", 10);
        } else if (MathUtil.betweenInclusive(13, 14, level)) {
            savingThrows.put("death", 8);
            savingThrows.put("wands", 9);
            savingThrows.put("paralysis", 7);
            savingThrows.put("breath", 10);
            savingThrows.put("spells", 8);
        }

        return savingThrows;
    }

    private static Map<String, Integer> getFighterSavingThrows(Integer level) {
        Map<String, Integer> savingThrows = new HashMap<>();
        savingThrows.put("death", 12);
        savingThrows.put("wands", 13);
        savingThrows.put("paralysis", 14);
        savingThrows.put("breath", 15);
        savingThrows.put("spells", 16);

        if (MathUtil.betweenInclusive(4, 6, level)) {
            savingThrows.put("death", 10);
            savingThrows.put("wands", 11);
            savingThrows.put("paralysis", 12);
            savingThrows.put("breath", 13);
            savingThrows.put("spells", 14);
        } else if (MathUtil.betweenInclusive(7, 9, level)) {
            savingThrows.put("death", 8);
            savingThrows.put("wands", 9);
            savingThrows.put("paralysis", 10);
            savingThrows.put("breath", 10);
            savingThrows.put("spells", 12);
        } else if (MathUtil.betweenInclusive(10, 12, level)) {
            savingThrows.put("death", 6);
            savingThrows.put("wands", 7);
            savingThrows.put("paralysis", 8);
            savingThrows.put("breath", 8);
            savingThrows.put("spells", 10);
        } else if (MathUtil.betweenInclusive(13, 14, level)) {
            savingThrows.put("death", 4);
            savingThrows.put("wands", 5);
            savingThrows.put("paralysis", 6);
            savingThrows.put("breath", 5);
            savingThrows.put("spells", 8);
        }

        return savingThrows;
    }
}
