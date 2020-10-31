package com.mastermind.distributed.dispatchers;

import com.mastermind.controllers.ProposalController;

public class BlacksDispatcher extends Dispatcher {
    public BlacksDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        int position = tcpip.receiveInt();
        this.tcpip.send(((ProposalController) this.acceptorController).getBlacks(position));
    }
}
