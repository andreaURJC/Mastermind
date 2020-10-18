package com.mastermind.views.console;


import com.mastermind.models.Game;
import com.mastermind.models.ProposedCombination;
import com.mastermind.views.Message;
import utils.Console;

class ProposalView extends SubView {
    private SecretCombinationView secretCombinationView;

    ProposalView(Game game) {
        super(game);
        this.secretCombinationView = new SecretCombinationView();
    }

    boolean interact() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.game.addProposedCombination(proposedCombination);
        Console console = new Console();
        console.writeln();
        Message.ATTEMPTS.writeln(this.game.getAttempts());
        this.secretCombinationView.writeln();
        for (int i = 0; i < this.game.getAttempts(); i++) {
            new ProposedCombinationView(this.game.getProposedCombination(i)).write();
            new ResultView(this.game.getResult(i)).writeln();
        }
        if (this.game.isWinner()) {
            Message.WINNER.writeln();
            return true;
        } else if (this.game.isLooser()) {
            Message.LOOSER.writeln();
            return true;
        }
        return false;
    }

}
