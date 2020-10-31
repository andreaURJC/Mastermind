package com.mastermind.distributed.dispatchers.errors;

import com.mastermind.controllers.ProposalController;
import com.mastermind.distributed.dispatchers.Dispatcher;
import com.mastermind.types.Color;

import java.util.List;

public class ProposedCombinationError extends Dispatcher {
    public ProposedCombinationError(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        List<Color> colors = this.tcpip.receiveColors();
        this.tcpip.send(((ProposalController) this.acceptorController).addProposedCombinationError(colors));
    }
}
