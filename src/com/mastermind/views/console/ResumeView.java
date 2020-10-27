package com.mastermind.views.console;

import com.mastermind.controllers.ResumeController;
import com.mastermind.views.Message;
import utils.YesNoDialog;

class ResumeView {

    void interact(ResumeController resumeController) {
        resumeController.resume(new YesNoDialog().read(Message.RESUME.getMessage()));
    }

}

