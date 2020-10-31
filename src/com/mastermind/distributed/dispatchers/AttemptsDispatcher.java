package com.mastermind.distributed.dispatchers;

import com.mastermind.controllers.ProposalController;
import com.mastermind.controllers.implementation.ProposalControllerImplementation;
import com.mastermind.distributed.dispatchers.Dispatcher;

public class AttemptsDispatcher extends Dispatcher {
    public AttemptsDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((ProposalController) this.acceptorController).getAttempts());
    }
}
