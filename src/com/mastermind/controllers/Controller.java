package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.Session;
import com.mastermind.models.State;
import com.mastermind.models.StateValue;

public abstract class Controller {
    protected Session session;

    Controller(Session session) {
        this.session = session;
    }

    public StateValue getValueState() {
        return this.session.getValueState();
    }

}
