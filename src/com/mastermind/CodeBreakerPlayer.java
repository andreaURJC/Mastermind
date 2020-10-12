package com.mastermind;

import utils.Console;

import java.util.List;

public class CodeBreakerPlayer implements Player {
    private Console console = Console.instance();

    public Combination putCombination() {
        String inputCombinationString = null;
        inputCombinationString = console.readString(Message.PROPOSE_COMBINATION.getMessage());

        while (!Combination.isValidCombination(inputCombinationString)) {
            inputCombinationString = console.readString(Message.ERROR.getMessage());
        }

        return Combination.stringToCombination(inputCombinationString);
    }
}
