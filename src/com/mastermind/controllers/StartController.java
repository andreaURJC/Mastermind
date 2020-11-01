package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.State;
import com.mastermind.views.Message;
import com.mastermind.views.console.SecretCombinationView;
import com.mastermind.views.console.StartView;

public class StartController extends Controller {
    public StartController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void control() {
        new StartView().write();
        new SecretCombinationView().writeln();
        this.next();
    }

}
