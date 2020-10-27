package com.mastermind.views.console;

import com.mastermind.controllers.ProposalController;
import com.mastermind.views.Message;

public class RedoCommand extends Command {
    protected RedoCommand(ProposalController proposalController) {
        super(Message.REDO_COMMAND.getMessage(), proposalController);
    }

    @Override
    protected void execute() {
        this.proposalController.redo();
    }

    @Override
    protected boolean isActive() {
        return this.proposalController.redoable();
    }
}
