package com.mastermind.views.console;

import com.mastermind.controllers.StartController;
import com.mastermind.views.Message;
import utils.WithConsoleView;

class StartView extends WithConsoleView {

    void interact(StartController startController) {
        startController.start();
        Message.TITLE.writeln();
        new SecretCombinationView(startController).write();
    }

}
