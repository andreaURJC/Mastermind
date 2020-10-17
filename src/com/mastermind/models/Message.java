package com.mastermind.models;

import utils.Console;

public enum Message {
    MASTERMIND("------ Mastermind ------"),
    YOU_WON("You've won!!! ;-)"),
    YOU_LOST("You've lost!!! :-("),
    ATTEMPS(" attempt(s):\n"),
    PROPOSE_COMBINATION("Propose a combination: "),
    ARROW(" --> "),
    COMBINATION_PATTERN("xxxx"),
    ERROR("Invalid combination, try again:"),
    BLACK_ITEMS("blacks "),
    WHITE_ITEMS("whites "),
    AND(" and "),
    RESUME("RESUME? (y/n): ");


    public String getMessage() {
        return message;
    }

    private String message;

    Message(String s) {
        this.message = s;
    }

    public void writeLine() {
        Console.instance().writeLine(this.message);
    }

    public void writeLine(int attempts) {
        Console.instance().write(this.message, attempts);
    }

}
