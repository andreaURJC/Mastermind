package com.mastermind.views.console;

import com.mastermind.views.Message;
import utils.WithConsoleView;

class StartView extends WithConsoleView {

    void interact() {
        Message.TITLE.writeln();
        new SecretCombinationView().writeln();
    }

}
