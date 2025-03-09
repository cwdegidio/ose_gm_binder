package com.cwdegidio.gmbinder.utils;

public class MathUtil {
    public static boolean betweenInclusive(int min, int max, int value) {
        return value >= min && value <= max;
    }
}
