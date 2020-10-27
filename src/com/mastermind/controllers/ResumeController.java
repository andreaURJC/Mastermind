package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.Session;
import com.mastermind.models.State;

public class ResumeController extends AcceptorController {

    public ResumeController(Session session) {
        super(session);
    }

    public void resume(boolean newGame) {
        if (newGame) {
            this.session.clear();
            this.session.reset();
        } else {
            this.session.next();
        }
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

    @Override
    public int getWidth() {
        return this.session.getWidth();
    }

}