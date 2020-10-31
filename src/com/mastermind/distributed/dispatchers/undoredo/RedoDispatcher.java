package com.mastermind.distributed.dispatchers.undoredo;

import com.mastermind.controllers.ProposalController;
import com.mastermind.controllers.implementation.ProposalControllerImplementation;
import com.mastermind.distributed.dispatchers.Dispatcher;

public class RedoDispatcher extends Dispatcher {
    public RedoDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        ((ProposalController) this.acceptorController).redo();
    }
}
