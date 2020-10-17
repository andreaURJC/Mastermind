package com.mastermind.views;

import com.mastermind.models.SecretCombination;
import utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

    SecretCombinationView() {
        super();
    }

    void writeln() {
        for (int i = 0; i < SecretCombination.getWidth(); i++) {
            MessageView.SECRET.write();
        }
        this.console.writeln();
    }

}