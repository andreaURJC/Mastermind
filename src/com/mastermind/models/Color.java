package com.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public enum Color {
    GREEN("g"),
    BLUE("b"),
    YELLOW("y"),
    ORANGE("o"),
    RED("r"),
    PURPLE("p");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColorString() {
        return color;
    }

    public static Color getColorFromString(String color) {
        switch (color) {
            case "g":
                return GREEN;
            case "b":
                return BLUE;
            case "y":
                return YELLOW;
            case "o":
                return ORANGE;
            case "r":
                return RED;
            case "p":
                return PURPLE;
            default:
                return null;
        }
    }

    public static List<Color> toColors(String inputCombinationString) {
        List<Color> colorList = new ArrayList<>();
        for (Character character : inputCombinationString.toCharArray()) {
            Color color = Color.getColorFromString(character.toString());
            colorList.add(color);
        }
        return colorList;
    }

}
