package com.mastermind.distributed.dispatchers;

import com.mastermind.controllers.AcceptorController;
import com.mastermind.controllers.implementation.ProposalControllerImplementation;
import com.mastermind.distributed.dispatchers.Dispatcher;

public class UndoDispatcher extends Dispatcher {
    public UndoDispatcher(AcceptorController acceptorController) {
        super(acceptorController);
    }

    @Override
    public void dispatch() {

    }
}
