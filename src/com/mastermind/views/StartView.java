package com.mastermind.views;

import com.mastermind.Message;
import com.mastermind.models.Game;

public class StartView {
    private Game game;

    public StartView(Game game) {
        this.game = game;
    }

    void interact() {
        Message.MASTERMIND.writeLine();
        new GameView(this.game).write();
    }
}
