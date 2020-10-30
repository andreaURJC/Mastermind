package com.mastermind.controllers.implementation;

import com.mastermind.controllers.ResumeController;
import com.mastermind.models.Session;

public class ResumeControllerImplementation extends ResumeController {

    private SessionImplementation sessionImplementation;

    public ResumeControllerImplementation(Session session) {
        super(session);
        this.sessionImplementation = (SessionImplementation) this.session;
    }

    @Override
    public int getWidth() {
        return this.sessionImplementation.getWidth();
    }

    @Override
    public void resume(boolean newGame) {
        if (newGame) {
            this.sessionImplementation.clear();
            this.sessionImplementation.reset();
        } else {
            this.sessionImplementation.next();
        }
    }
}
