package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.State;

public class ResumeController extends Controller{
    public ResumeController(Game game, State state) {
        super(game,state);
    }

    public void clear() {
        this.game.clear();
        this.state.reset();
    }
}
