package com.mastermind.views.console;

import com.mastermind.controllers.ProposalController;
import com.mastermind.types.Color;
import com.mastermind.views.MessageView;
import utils.WithConsoleView;
import com.mastermind.types.Error;

import java.util.List;

class ProposalView extends WithConsoleView {

    void interact(ProposalController proposalController) {
        Error error;
        do {
            List<Color> colors = new ProposedCombinationView(proposalController).read();
            error = proposalController.addProposedCombination(colors);
            if (error != null) {
                new ErrorView(error).writeln();
            }
        } while (error != null);
        this.console.writeln();
        new AttemptsView(proposalController).writeln();
        new SecretCombinationView(proposalController).writeln();
        for (int i = 0; i < proposalController.getAttempts(); i++) {
            new ProposedCombinationView(proposalController).write(i);
            new ResultView(proposalController).writeln(i);
        }
        if (proposalController.isWinner()) {
            this.console.writeln(MessageView.WINNER.getMessage());
        } else if (proposalController.isLooser()) {
            this.console.writeln(MessageView.LOOSER.getMessage());
        }
    }

}
