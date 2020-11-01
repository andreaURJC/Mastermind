package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.State;
import com.mastermind.views.Message;
import com.mastermind.views.console.ProposedCombinationView;
import com.mastermind.views.console.ResultView;
import com.mastermind.views.console.SecretCombinationView;

public abstract class InGameController extends Controller {

    public InGameController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void control() {
        this.inGameControl();
        this.writeStoredProposedCombination();
        this.writeIsWinnerOrLooser();
    }

    protected abstract void inGameControl();

    private void writeStoredProposedCombination() {
        Message.ATTEMPTS.writeln(this.game.getAttempts());
        new SecretCombinationView().writeln();
        for (int i = 0; i < this.game.getAttempts(); i++) {
            new ProposedCombinationView(this.game.getProposedCombination(i)).write();
            new ResultView(this.game.getResult(i)).writeln();
        }
    }

    private void writeIsWinnerOrLooser() {
        if(this.game.isWinner()) {
            Message.WINNER.writeln();
            this.next();
        } else if (this.game.isLooser()) {
            Message.LOOSER.writeln();
            this.next();
        }
    }
}
