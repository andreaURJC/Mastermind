package com.mastermind.controllers.implementation;

import com.mastermind.controllers.*;
import com.mastermind.models.Session;
import com.mastermind.types.Color;
import com.mastermind.types.Error;

import java.util.List;

public class ProposalControllerImplementation extends ProposalController {
    private SessionImplementation sessionImplementation;
    private MovementController movementController;
    private UndoController undoController;
    private RedoController redoController;

    ProposalControllerImplementation(Session session) {
        super(session);
        this.sessionImplementation = (SessionImplementation) session;
        this.movementController = new MovementController(session);
        this.redoController = new RedoController(session);
        this.undoController = new UndoController(session);
    }

    @Override
    public Error addProposedCombinationError(List<Color> colors) {
        Error error = this.movementController.addProposedCombination(colors);
        if (error == null && this.sessionImplementation.isWinner() || this.sessionImplementation.isLooser()) {
            this.sessionImplementation.next();
        }
        return error;
    }

    @Override
    public boolean isWinner() {
       return this.movementController.isWinner();
    }

    @Override
    public boolean isLooser() {
        return this.movementController.isLooser();
    }

    @Override
    public int getAttempts() {
        return this.movementController.getAttempts();
    }

    @Override
    public List<Color> getColors(int position) {
        return this.movementController.getColors(position);
    }

    @Override
    public int getBlacks(int position) {
        return this.getBlacks(position);
    }

    @Override
    public int getWhites(int position) {
        return this.getWhites(position);
    }

    @Override
    public void undo() {
        this.undoController.undo();
    }

    @Override
    public void redo() {
        this.redoController.redo();
    }

    @Override
    public boolean undoable() {
        return this.undoController.undoable();
    }

    @Override
    public boolean redoable() {
        return this.redoController.redoable();
    }

    @Override
    public int getWidth() {
        return this.movementController.getWidth();
    }
}
