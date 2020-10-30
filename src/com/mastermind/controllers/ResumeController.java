package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.Session;
import com.mastermind.models.State;

public abstract class ResumeController extends AcceptorController {

    public ResumeController(Session session) {
        super(session);
    }

    public abstract void resume(boolean newGame);

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }
}