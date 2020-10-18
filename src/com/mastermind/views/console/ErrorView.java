package com.mastermind.views.console;

import utils.Console;
import com.mastermind.models.Error;

class ErrorView extends com.mastermind.views.ErrorView {

    private Error error;

    ErrorView(Error error) {
        this.error = error;
    }

    void writeln() {
        Console console = new Console();
        console.writeln(MESSAGES[this.error.ordinal()]);
    }
}