package com.mastermind.views.console;

import com.mastermind.controllers.Logic;
import com.mastermind.views.Message;
import utils.YesNoDialog;

class ResumeView {
    private Logic logic;

    ResumeView(Logic logic) {
        this.logic = logic;
    }

    boolean interact() {
        Message.RESUME.write();
        boolean newGame = new YesNoDialog().read();
        if (newGame) {
            this.logic.clear();
        }
        return newGame;
    }

}
