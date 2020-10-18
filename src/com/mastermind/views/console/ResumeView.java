package com.mastermind.views.console;

import com.mastermind.controllers.ResumeController;
import com.mastermind.views.Message;
import utils.YesNoDialog;

class ResumeView {

    void interact(ResumeController resumeController) {
        Message.RESUME.write();
        boolean newGame = new YesNoDialog().read();
        if (newGame) {
            resumeController.clear();
        } else {
            resumeController.next();
        }
    }

}
