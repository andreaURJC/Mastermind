package com.mastermind.views.console;

import com.mastermind.controllers.ProposalController;

public abstract class Command extends utils.Command {

    protected ProposalController proposalController;

    protected Command(String title, ProposalController proposalController) {
        super(title);
        this.proposalController = proposalController;
    }
}
