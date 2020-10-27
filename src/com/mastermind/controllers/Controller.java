package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.Session;
import com.mastermind.models.State;

public abstract class Controller {
    protected Session session;

    Controller(Session session) {
        this.session = session;
    }

}
