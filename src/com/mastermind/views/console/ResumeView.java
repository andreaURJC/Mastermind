package com.mastermind.views.console;

import com.mastermind.controllers.ResumeController;
import com.mastermind.views.Message;
import utils.YesNoDialog;

class ResumeView {
    ResumeController resumeController;

    ResumeView(ResumeController resumeController) {
        this.resumeController = resumeController;
    }

    boolean interact() {
        Message.RESUME.write();
        boolean newGame = new YesNoDialog().read();
        if (newGame) {
            this.resumeController.clear();
        }
        return newGame;
    }

}
