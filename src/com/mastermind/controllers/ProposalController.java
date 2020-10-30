package com.mastermind.controllers;

import com.mastermind.models.*;
import com.mastermind.types.Color;
import com.mastermind.types.Error;

import java.util.List;

public abstract class ProposalController extends AcceptorController {

    private MovementController movementController;
    private UndoController undoController;
    private RedoController redoController;

    public ProposalController(Session session) {
        super(session);
        this.movementController = new MovementController(session);
        this.redoController = new RedoController(session);
        this.undoController = new UndoController(session);
    }

    public abstract Error addProposedCombinationError(List<Color> colors);

    public abstract boolean isWinner();

    public abstract boolean isLooser();

    public abstract int getAttempts();

    public abstract List<Color> getColors(int position);

    public abstract int getBlacks(int position);

    public abstract int getWhites(int position);

    public abstract void undo();

    public abstract void redo();

    public abstract boolean undoable();

    public abstract boolean redoable();

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

    public abstract int getWidth();
}
