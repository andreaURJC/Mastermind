package com.mastermind.distributed.dispatchers;

import com.mastermind.controllers.ProposalController;

public class LooserDispatcher extends Dispatcher {
    public LooserDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((ProposalController) this.acceptorController).isLooser());
    }
}
