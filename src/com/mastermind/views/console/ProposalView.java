package com.mastermind.views.console;

import com.mastermind.controllers.Logic;
import com.mastermind.models.ProposedCombination;
import com.mastermind.views.Message;
import utils.Console;

class ProposalView {
    private SecretCombinationView secretCombinationView;
    private Logic logic;

    ProposalView(Logic logic) {
        this.logic = logic;
        this.secretCombinationView = new SecretCombinationView();
    }

    boolean interact() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.logic.addProposedCombination(proposedCombination);
        Console console = new Console();
        console.writeln();
        Message.ATTEMPTS.writeln(this.logic.getAttempts());
        this.secretCombinationView.writeln();
        for (int i = 0; i < this.logic.getAttempts(); i++) {
            new ProposedCombinationView(this.logic.getProposedCombination(i)).write();
            new ResultView(this.logic.getResult(i)).writeln();
        }
        if (this.logic.isWinner()) {
            Message.WINNER.writeln();
            return true;
        } else if (this.logic.isLooser()) {
            Message.LOOSER.writeln();
            return true;
        }
        return false;
    }

}
