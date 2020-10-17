package com.mastermind.views;

import com.mastermind.models.Game;
import utils.YesNoDialog;

public class ResumeView {
    public boolean interact() {
        YesNoDialog yesNoDialog = new YesNoDialog();

        return yesNoDialog.read();
    }
}
