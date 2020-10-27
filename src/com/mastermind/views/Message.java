package com.mastermind.views;

import utils.Console;

public enum Message {
    ATTEMPTS("#attempts attempt(s): "),
    SECRET("*"),
    RESUME("Do you want to continue"),
    RESULT(" --> #blacks blacks and #whites whites"),
    PROPOSED_COMBINATION("Propose a combination: "),
    TITLE("----- MASTERMIND -----"),
    WINNER("You've won!!! ;-)"),
    LOOSER("You've lost!!! :-("),
    UNDO_COMMAND("Undo previous action"),
    REDO_COMMAND("Redo previous action"),
    ACTION_COMMAND("Do an action");

    private String message;

    private Console console = Console.instance();

    public String getMessage() {
        return this.message;
    }

    private Message(String message) {
        this.message = message;
    }

    public void write() {
        this.console.write(this.message);
    }

    public void writeln() {
        this.console.writeln(this.message);
    }

    public void writeln(int attempts) {
        this.console.writeln(this.message.replaceAll("#attempts", "" + attempts));
    }

    public void writeln(int blacks, int whites) {
        this.console.writeln(this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
    }
}
