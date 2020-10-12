package com.mastermind.views;

import com.mastermind.Color;
import com.mastermind.Combination;
import utils.Console;

public class CombinationView {
    Color[] colors = Color.values();
    Combination combination;

    public CombinationView(Combination combination) {
        this.combination = combination;
    }

    public CombinationView() {}

    void write() {
        Console.instance().writeLine(combination.getStringCombination());
    }

    Combination read(String message) {
        String stringCombination;
        do {
            stringCombination = Console.instance().readString(message);
        } while (Combination.isValidCombination(stringCombination));
        return Combination.stringToCombination(stringCombination);
    }
}
