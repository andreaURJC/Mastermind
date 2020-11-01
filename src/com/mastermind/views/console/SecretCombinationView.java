package com.mastermind.views.console;

import com.mastermind.models.SecretCombination;
import com.mastermind.views.Message;
import utils.WithConsoleView;

public class SecretCombinationView extends WithConsoleView {

    public SecretCombinationView() {
        super();
    }

    public void writeln() {
        for (int i = 0; i < SecretCombination.getWidth(); i++) {
            Message.SECRET.write();
        }
        this.console.writeln();
    }

}