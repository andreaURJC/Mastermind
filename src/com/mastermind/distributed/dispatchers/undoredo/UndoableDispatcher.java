package com.mastermind.distributed.dispatchers.undoredo;

import com.mastermind.controllers.ProposalController;
import com.mastermind.distributed.dispatchers.Dispatcher;

public class UndoableDispatcher extends Dispatcher {
    public UndoableDispatcher(ProposalController proposalController) {
        super(proposalController);
    }


    @Override
    public void dispatch() {
        ((ProposalController) this.acceptorController).undoable();
    }
}
