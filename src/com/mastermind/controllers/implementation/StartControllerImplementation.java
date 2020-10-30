package com.mastermind.controllers.implementation;

import com.mastermind.controllers.StartController;
import com.mastermind.models.Session;

public class StartControllerImplementation extends StartController {
    private SessionImplementation sessionImplementation;

    public StartControllerImplementation(Session session) {
        super(session);
        this.sessionImplementation = (SessionImplementation) this.session;
    }

    @Override
    public int getWidth() {
        return this.sessionImplementation.getWidth();
    }

    @Override
    public void start() {
        this.sessionImplementation.next();
    }

}
