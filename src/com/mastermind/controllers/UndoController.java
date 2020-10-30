package com.mastermind.controllers;

import com.mastermind.controllers.implementation.SessionImplementation;
import com.mastermind.models.Session;

public class UndoController extends Controller {

    SessionImplementation sessionImplementation;

    public UndoController(Session session) {
        super(session);
        this.sessionImplementation = (SessionImplementation) session;
    }

    public void undo() {
        this.sessionImplementation.undo();
    }

    public boolean undoable() {
        return this.sessionImplementation.undoable();
    }
}
