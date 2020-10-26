package com.mastermind.views.console;

import com.mastermind.types.Error;
import utils.Console;

class ErrorView extends com.mastermind.views.ErrorView {

   public ErrorView(Error error) {
        super(error);
    }

    void writeln() {
        new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
    }

}