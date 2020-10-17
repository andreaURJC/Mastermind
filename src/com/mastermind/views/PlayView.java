package com.mastermind.views;

import com.mastermind.models.Combination;
import com.mastermind.models.Message;
import com.mastermind.models.Game;

public class PlayView {
    private Game game;

    public PlayView(Game game) {
        this.game = game;
    }

    public void interact() {
        do {
            if (this.game.isSecretCombinationSet()) {
                this.putCombination();
            } else {
                this.putSecretCombination();
            }
        } while (game.isBoardCompleted() || game.isMastermindGuessed());

        this.writeResult();


    }

    private void putSecretCombination() {
        this.game.putSecretCombination();
    }

    private void putCombination() {
        Combination combination = new CombinationView().read(Message.PROPOSE_COMBINATION.getMessage());
        game.putCombination(combination);
    }

    private void writeResult() {
        if (game.isWinner()) {
            Message.YOU_WON.writeLine();
        } else {
            Message.YOU_LOST.writeLine();
        }
    }
}
