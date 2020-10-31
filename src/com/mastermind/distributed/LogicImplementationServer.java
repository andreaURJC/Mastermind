package com.mastermind.distributed;

import com.mastermind.controllers.implementation.LogicImplementation;
import com.mastermind.distributed.dispatchers.*;
import com.mastermind.distributed.dispatchers.errors.ProposedCombinationError;
import com.mastermind.distributed.dispatchers.undoredo.RedoDispatcher;
import com.mastermind.distributed.dispatchers.undoredo.RedoableDispatcher;
import com.mastermind.distributed.dispatchers.undoredo.UndoableDispatcher;
import com.mastermind.models.ProposedCombination;

import java.awt.*;

public class LogicImplementationServer extends LogicImplementation {
    public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
        dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.ATTEMPTS, new AttemptsDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.BLACKS, new BlacksDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.WHITES, new WhitesDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.LOOSER, new LooserDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.WINNER, new WinnerDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.COLORS, new ColorsDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.WIDTH, new WidthDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.RESUME, new ResumeDispatcher(this.resumeControllerImplementation));
        dispatcherPrototype.add(FrameType.PROPOSED_COMBINATION_ERROR, new ProposedCombinationError(this.proposalControllerImplementation));
    }
}
