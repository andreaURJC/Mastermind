package com.mastermind;

public enum Message {
    MASTERMIND("------ Mastermind ------"),
    YOU_WON("You've won!!! ;-)"),
    YOU_LOST("You've lost!!! :-("),
    ATTEMPS("attempt(s):"),
    PROPOSE_COMBINATION("Propose a combination: "),
    ARROW(" --> "),
    COMBINATION_PATTERN("xxxx"),
    ERROR("Invalid combination, try again:");

    private String message;

    Message(String s) {
        this.message = s;
    }

    public String getMessage() {
        return message;
    }

}
