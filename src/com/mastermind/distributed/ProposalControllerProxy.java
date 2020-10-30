package com.mastermind.distributed;

import com.mastermind.controllers.ProposalController;
import com.mastermind.distributed.dispatchers.FrameType;
import com.mastermind.models.Session;
import com.mastermind.types.Color;
import com.mastermind.types.Error;
import com.mastermind.distributed.dispatchers.TCPIP;

import java.util.List;

public class ProposalControllerProxy extends ProposalController {
    private TCPIP tcpip;

    public ProposalControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public Error addProposedCombinationError(List<Color> colors) {
        this.tcpip.send(FrameType.PROPOSED_COMBINATION_ERROR.name());
        this.tcpip.send(colors);
        return this.tcpip.receiveError();
    }

    @Override
    public boolean isWinner() {
        this.tcpip.send(FrameType.WINNER.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public boolean isLooser() {
        this.tcpip.send(FrameType.LOOSER.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public int getAttempts() {
        this.tcpip.send(FrameType.ATTEMPTS.name());
        return this.tcpip.receiveInt();
    }

    @Override
    public List<Color> getColors(int position) {
        this.tcpip.send(FrameType.COLORS.name());
        return this.tcpip.receiveColors();
    }

    @Override
    public int getBlacks(int position) {
        this.tcpip.send(FrameType.BLACKS.name());
        return this.tcpip.receiveInt();
    }

    @Override
    public int getWhites(int position) {
        this.tcpip.send(FrameType.WHITES.name());
        return this.tcpip.receiveInt();
    }

    @Override
    public void undo() {
        this.tcpip.send(FrameType.UNDO.name());
    }

    @Override
    public void redo() {
        this.tcpip.send(FrameType.REDO.name());
    }

    @Override
    public boolean undoable() {
        this.tcpip.send(FrameType.UNDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public boolean redoable() {
        this.tcpip.send(FrameType.REDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public int getWidth() {
        this.tcpip.send(FrameType.WIDTH.name());
        return this.tcpip.receiveInt();
    }
}
