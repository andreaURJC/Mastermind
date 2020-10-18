package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.State;

public abstract class Controller {

    protected Game game;
    protected State state;

    Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }

    public void next() {
        this.state.next();
    }
}
