package com.mastermind.views.console;


import com.mastermind.controllers.ProposalController;
import com.mastermind.models.ProposedCombination;
import com.mastermind.views.Message;
import utils.Console;

class ProposalView {
    private SecretCombinationView secretCombinationView;
    private ProposalController proposalController;

    ProposalView(ProposalController proposalController) {
        this.proposalController = proposalController;
        this.secretCombinationView = new SecretCombinationView();
    }

    boolean interact() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.proposalController.addProposedCombination(proposedCombination);
        Console console = new Console();
        console.writeln();
        Message.ATTEMPTS.writeln(this.proposalController.getAttempts());
        this.secretCombinationView.writeln();
        for (int i = 0; i < this.proposalController.getAttempts(); i++) {
            new ProposedCombinationView(this.proposalController.getProposedCombination(i)).write();
            new ResultView(this.proposalController.getResult(i)).writeln();
        }
        if (this.proposalController.isWinner()) {
            Message.WINNER.writeln();
            return true;
        } else if (this.proposalController.isLooser()) {
            Message.LOOSER.writeln();
            return true;
        }
        return false;
    }

}
