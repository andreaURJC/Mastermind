package com.mastermind.controllers;

import com.mastermind.models.Session;

public abstract class AcceptorController extends Controller {
    AcceptorController(Session session) {
        super(session);
    }

    public abstract void accept(ControllersVisitor controllersVisitor);

    public abstract int getWidth();
}
