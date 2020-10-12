package com.mastermind.views;

import com.mastermind.Message;
import com.mastermind.models.Game;

public class GameView {

    private Game game;

    public GameView(Game game) {
        this.game = game;
    }

    public void write() {
        Message.ATTEMPS.writeLine();
        Message.COMBINATION_PATTERN.writeLine();

        for (int i = 0; i < game.getBoard().getAttempts(); i++) {
            new CombinationView(game.getBoard().getCombinationAtIndex(i)).write();
            Message.ARROW.writeLine();
            new ResultView(game.getBoard().getResultAtIndex(i)).write();
        }
    }
}
