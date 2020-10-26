package com.mastermind.views.console;

import com.mastermind.controllers.ProposalController;

import com.mastermind.views.MessageView;
import utils.WithConsoleView;

public class AttemptsView extends WithConsoleView {

    private ProposalController proposalController;

    AttemptsView(ProposalController proposalController) {
        this.proposalController = proposalController;
    }

    void writeln() {
        this.console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts",
                "" + this.proposalController.getAttempts()));
    }

}