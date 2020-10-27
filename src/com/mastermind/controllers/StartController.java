package com.mastermind.controllers;

import com.mastermind.models.Session;

public class StartController extends AcceptorController {

    public StartController(Session session) {
        super(session);
    }

    public void start() {
        this.session.next();
    }

    public int getWidth() {
        return this.session.getWidth();
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
