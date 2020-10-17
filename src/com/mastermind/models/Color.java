package com.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public enum Color {
    RED,
    BLUE,
    YELLOW,
    GREEN,
    ORANGE,
    PURPLE;

    static int length() {
        return Color.values().length;
    }

}
