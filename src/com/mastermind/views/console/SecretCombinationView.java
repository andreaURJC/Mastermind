package com.mastermind.views.console;

import com.mastermind.models.SecretCombination;
import com.mastermind.views.Message;
import utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

    SecretCombinationView() {
        super();
    }

    void writeln() {
        for (int i = 0; i < SecretCombination.getWidth(); i++) {
            Message.SECRET.write();
        }
        this.console.writeln();
    }

}