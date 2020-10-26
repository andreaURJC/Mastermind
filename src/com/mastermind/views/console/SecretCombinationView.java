package com.mastermind.views.console;

import com.mastermind.controllers.Controller;
import com.mastermind.models.SecretCombination;
import com.mastermind.views.Message;
import com.mastermind.views.MessageView;
import utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

    private Controller controller;

    SecretCombinationView(Controller controller) {
        super();
        this.controller = controller;
    }

    void writeln() {
        for (int i = 0; i < this.controller.getWidth(); i++) {
            this.console.write(MessageView.SECRET.getMessage());
        }
        this.console.writeln();
    }

}