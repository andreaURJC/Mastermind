package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.State;

public class StartController extends UserCaseController {
    public StartController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
