package com.mastermind.distributed;

import com.mastermind.controllers.AcceptorController;
import com.mastermind.controllers.StartController;
import com.mastermind.distributed.dispatchers.FrameType;
import com.mastermind.models.Session;
import utils.TCPIP;

public class StartControllerProxy extends StartController {

    public TCPIP tcpip;

    public StartControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public void start() {
        this.tcpip.send(FrameType.START.name());
    }

    @Override
    public int getWidth() {
        //TODO: get from service
        return 0;
    }
}
