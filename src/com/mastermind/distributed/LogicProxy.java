package com.mastermind.distributed;

import com.mastermind.controllers.Logic;
import com.mastermind.models.StateValue;
import com.mastermind.distributed.dispatchers.TCPIP;

public class LogicProxy extends Logic {
    private TCPIP tcpip;

    public LogicProxy() {
        this.tcpip = TCPIP.createClientSocket();
        this.session = new SessionProxy(this.tcpip);
        this.acceptorControllers.put(StateValue.INITIAL, new StartControllerProxy(this.session, this.tcpip));
        this.acceptorControllers.put(StateValue.IN_GAME, new ProposalControllerProxy(this.session,this.tcpip));
        this.acceptorControllers.put(StateValue.FINAL, new ResumeControllerProxy(this.session, this.tcpip));
    }
    public void close() {
        this.tcpip.close();
    }
}
