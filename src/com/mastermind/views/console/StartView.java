package com.mastermind.views.console;

import com.mastermind.controllers.StartController;
import com.mastermind.views.Message;
import com.mastermind.views.MessageView;
import utils.WithConsoleView;

class StartView extends WithConsoleView {

    private SecretCombinationView secretCombinationView;

    void interact(StartController startController) {
        startController.start();
        this.console.writeln(MessageView.TITLE.getMessage());
        this.secretCombinationView = new SecretCombinationView(startController);
        this.secretCombinationView.writeln();
    }

}
