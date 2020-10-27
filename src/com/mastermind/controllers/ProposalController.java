package com.mastermind.controllers;

import com.mastermind.models.*;
import com.mastermind.types.Color;
import com.mastermind.types.Error;

import java.util.List;

public class ProposalController extends AcceptorController {

    private MovementController movementController;
    private UndoController undoController;
    private RedoController redoController;

    public ProposalController(Session session) {
        super(session);
        this.movementController = new MovementController(session);
        this.redoController = new RedoController(session);
        this.undoController = new UndoController(session);
    }

    public Error addProposedCombination(List<Color> colors) {
        Error error = this.movementController.addProposedCombination(colors);
        if (error == null && this.session.isWinner() || this.session.isLooser()) {
            this.session.next();
        }
        return error;
    }

    public boolean isWinner() {
        return this.movementController.isWinner();
    }

    public boolean isLooser() {
        return this.movementController.isLooser();
    }

    public int getAttempts() {
        return this.movementController.getAttempts();
    }

    public List<Color> getColors(int position) {
        return this.movementController.getColors(position);
    }

    public int getBlacks(int position) {
        return this.movementController.getBlacks(position);
    }

    public int getWhites(int position) {
        return this.movementController.getWhites(position);
    }

    public void undo() {
        this.undoController.undo();
    }

    public void redo() {
        this.redoController.redo();
    }

    public boolean undoable() {
        return this.undoController.undoable();
    }

    public boolean redoable() {
        return this.redoController.redoable();
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

    public int getWidth() {
        return this.movementController.getWidth();
    }
}
