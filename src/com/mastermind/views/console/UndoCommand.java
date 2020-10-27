package com.mastermind.views.console;

import com.mastermind.controllers.ProposalController;
import com.mastermind.views.Message;

public class UndoCommand extends Command {
    protected UndoCommand(ProposalController proposalController) {
        super(Message.UNDO_COMMAND.getMessage(), proposalController);
    }

    @Override
    protected void execute() {
        this.proposalController.undo();
    }

    @Override
    protected boolean isActive() {
        return this.proposalController.undoable();
    }
}
