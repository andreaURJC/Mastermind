package com.mastermind.distributed.dispatchers;

import com.mastermind.controllers.ProposalController;

public class WidthDispatcher extends Dispatcher {
    public WidthDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(acceptorController.getWidth());
    }
}
