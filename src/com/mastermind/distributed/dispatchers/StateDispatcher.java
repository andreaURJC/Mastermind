package com.mastermind.distributed.dispatchers;

import com.mastermind.controllers.AcceptorController;

public class StateDispatcher extends Dispatcher {
    public StateDispatcher(AcceptorController acceptorController) {
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(this.acceptorController.getValueState().ordinal());
    }
}
