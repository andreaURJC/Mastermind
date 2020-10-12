package com.mastermind.views;

import com.mastermind.Combination;
import com.mastermind.Message;
import com.mastermind.models.Game;

import javax.swing.*;
import java.util.List;

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
    }

    private void putSecretCombination() {
        this.game.putSecretCombination();
    }

    private void putCombination() {
        Combination combination = new CombinationView().read(Message.PROPOSE_COMBINATION.toString());
    }
}
