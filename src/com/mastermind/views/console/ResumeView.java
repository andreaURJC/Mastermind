package com.mastermind.views.console;

import com.mastermind.models.Game;
import com.mastermind.views.Message;
import utils.YesNoDialog;

class ResumeView extends SubView {
    ResumeView(Game game) {
        super(game);
    }

    boolean interact() {
        Message.RESUME.write();
        boolean newGame = new YesNoDialog().read();
        if (newGame) {
            this.game.clear();
        }
        return newGame;
    }

}
