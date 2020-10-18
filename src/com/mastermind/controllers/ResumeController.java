package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.State;

public class ResumeController extends UserCaseController {
    public ResumeController(Game game, State state) {
        super(game, state);
    }

    public void clear() {
        this.game.clear();
        this.state.reset();
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
