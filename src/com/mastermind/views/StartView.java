package com.mastermind.views;

import utils.WithConsoleView;

class StartView extends WithConsoleView {

    void interact() {
        MessageView.TITLE.writeln();
        new SecretCombinationView().writeln();
    }

}
