package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.State;
import com.mastermind.views.Message;
import com.mastermind.views.console.ResumeView;
import utils.YesNoDialog;

public class ResumeController extends Controller {
    public ResumeController(Game game, State state) {
        super(game, state);
    }

    private void clear() {
        this.game.clear();
        this.state.reset();
    }

    @Override
    public void control() {
        new ResumeView().write();
        boolean newGame = new YesNoDialog().read();
        if (newGame) {
            this.clear();
        } else {
            this.next();
        }
    }
}
