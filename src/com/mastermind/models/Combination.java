package com.mastermind.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Combination {
    public List<Color> getCombination() {
        return combination;
    }

    private List<Color> combination;

    private String stringCombination;

    public Combination(List<Color> combination) {
        this.combination = combination;
    }

    public String getStringCombination() {
        return stringCombination;
    }

    public static boolean isValidCombination(String string) {
        boolean isValidLength = string.toCharArray().length == 4;
        Combination inputCombination = stringToCombination(string);
        boolean isValidCombination = inputCombination.combination.stream().filter(Objects::isNull).toArray().length == 0;

        return isValidLength && isValidCombination;
    }

    public static Combination stringToCombination(String inputCombinationString) {
        List<Color> colorList = new ArrayList<>();
        for (Character character : inputCombinationString.toCharArray()) {
                Color color = Color.getColorFromString(character.toString());
                colorList.add(color);
        }
        return new Combination(colorList);
    }

}
