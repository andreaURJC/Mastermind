package com.mastermind.views.console;

import com.mastermind.models.Game;

public class SubView {
    protected Game game;

    SubView(Game game) {
        assert game != null;
        this.game = game;
    }
}
