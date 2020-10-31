package com.mastermind.distributed;

import com.mastermind.distributed.dispatchers.FrameType;
import com.mastermind.distributed.dispatchers.TCPIP;
import com.mastermind.models.Session;
import com.mastermind.models.State;
import com.mastermind.models.StateValue;

public class SessionProxy implements Session {
    private TCPIP tcpip;

    public SessionProxy(TCPIP tcpip) {
        this.tcpip = tcpip;
    }

    @Override
    public StateValue getValueState() {
        this.tcpip.send(FrameType.STATE.name());
        return StateValue.values()[this.tcpip.receiveInt()];
    }
}
