package com.mastermind.distributed.dispatchers;

import com.mastermind.controllers.ProposalController;

public class WinnerDispatcher extends Dispatcher {
    public WinnerDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((ProposalController) this.acceptorController).isWinner());
    }
}
