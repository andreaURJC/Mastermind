package com.mastermind.views.console;

import com.mastermind.controllers.ProposalController;

import com.mastermind.views.Message;
import utils.WithConsoleView;

public class AttemptsView extends WithConsoleView {

    private ProposalController proposalController;

    AttemptsView(ProposalController proposalController) {
        this.proposalController = proposalController;
    }

    void writeln() {
        this.console.writeln(Message.ATTEMPTS.getMessage().replaceFirst("#attempts",
                "" + this.proposalController.getAttempts()));
    }

}