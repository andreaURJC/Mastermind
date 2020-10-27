package com.mastermind.views.console;

import com.mastermind.controllers.AcceptorController;
import com.mastermind.controllers.StartController;
import com.mastermind.views.Message;
import utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

    private AcceptorController controller;

    SecretCombinationView(AcceptorController controller) {
        super();
        this.controller = controller;
    }

    void write() {
        for (int i = 0; i < this.controller.getWidth(); i++) {
            Message.SECRET.writeln();
        }
    }

}