package com.mastermind.distributed.dispatchers.undoredo;

import com.mastermind.controllers.ProposalController;
import com.mastermind.distributed.dispatchers.Dispatcher;

public class UndoDispatcher extends Dispatcher {
    public UndoDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        ((ProposalController) this.acceptorController).undo();
    }
}
