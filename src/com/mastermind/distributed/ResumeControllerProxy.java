package com.mastermind.distributed;

import com.mastermind.controllers.AcceptorController;
import com.mastermind.controllers.ResumeController;
import com.mastermind.distributed.dispatchers.FrameType;
import com.mastermind.models.Session;
import utils.TCPIP;

public class ResumeControllerProxy extends ResumeController {
    private TCPIP tcpip;

    public ResumeControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public void resume(boolean newGame) {
        this.tcpip.send(FrameType.NEW_GAME.name());
        this.tcpip.send(newGame);
    }

    @Override
    public int getWidth() {
        //TODO:
        return 0;
    }
}
