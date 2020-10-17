package com.mastermind.views;

import com.mastermind.models.Message;
import com.mastermind.models.Game;

public class GameView {

    private Game game;

    public GameView(Game game) {
        this.game = game;
    }

    public void write() {
        Message.ATTEMPS.writeLine(this.game.getAttempts());
        Message.COMBINATION_PATTERN.writeLine();

        if (game.getBoard().getAttempts() > 0) {
            for (int i = 0; i < game.getBoard().getAttempts(); i++) {
                new CombinationView(game.getBoard().getCombinationAtIndex(i)).write();
                Message.ARROW.writeLine();
                new ResultView(game.getBoard().getResultAtIndex(i)).write();
            }
        }
    }
}
