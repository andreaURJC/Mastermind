package com.mastermind.controllers;

import com.mastermind.controllers.implementation.SessionImplementation;
import com.mastermind.models.Session;

public class RedoController extends Controller {
    private SessionImplementation sessionImplementation;

    public RedoController(Session session) {
        super(session);
        this.sessionImplementation = (SessionImplementation) session;
    }

    public void redo() {
        this.sessionImplementation.redo();
    }

    public boolean redoable() {
       return this.sessionImplementation.redoable();
    }
}
