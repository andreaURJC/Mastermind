package com.mastermind.views.console;

import com.mastermind.controllers.ProposalController;
import utils.WithConsoleView;

class ProposalView extends WithConsoleView {

    void interact(ProposalController proposalController) {
        this.console.writeln();
        new AttemptsView(proposalController).writeln();
        new SecretCombinationView(proposalController).write();
        for (int i = 0; i < proposalController.getAttempts(); i++) {
            new ProposedCombinationView(proposalController).write(i);
            new ResultView(proposalController).writeln(i);
        }
        new PlayMenu(proposalController).execute();
    }
}
