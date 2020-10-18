package com.mastermind.views.console;

import com.mastermind.controllers.ProposalController;
import com.mastermind.models.ProposedCombination;
import com.mastermind.views.Message;
import utils.Console;

class ProposalView {
    private SecretCombinationView secretCombinationView;

    ProposalView () {
        this.secretCombinationView = new SecretCombinationView();
    }

    void interact(ProposalController proposalController) {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        proposalController.addProposedCombination(proposedCombination);
        Console console = new Console();
        console.writeln();
        Message.ATTEMPTS.writeln(proposalController.getAttempts());
        this.secretCombinationView.writeln();
        for (int i = 0; i < proposalController.getAttempts(); i++) {
            new ProposedCombinationView(proposalController.getProposedCombination(i)).write();
            new ResultView(proposalController.getResult(i)).writeln();
        }
        if (proposalController.isWinner()) {
            Message.WINNER.writeln();
            proposalController.next();

        } else if (proposalController.isLooser()) {
            Message.LOOSER.writeln();
            proposalController.next();
        }
    }

}
