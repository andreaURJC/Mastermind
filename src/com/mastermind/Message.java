package com.mastermind;

import utils.Console;

public enum Message {
    MASTERMIND("------ Mastermind ------"),
    YOU_WON("You've won!!! ;-)"),
    YOU_LOST("You've lost!!! :-("),
    ATTEMPS("attempt(s):"),
    PROPOSE_COMBINATION("Propose a combination: "),
    ARROW(" --> "),
    COMBINATION_PATTERN("xxxx"),
    ERROR("Invalid combination, try again:"),
    BLACK_ITEMS("blacks "),
    WHITE_ITEMS("whites "),
    AND(" and ");

    private String message;

    Message(String s) {
        this.message = s;
    }

    public String getMessage() {
        return message;
    }

    public void writeLine() {
        Console.instance().writeLine(this.message);
    }

}
