package com.mastermind.controllers;

import com.mastermind.models.*;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private Session session;

    private Map<StateValue, AcceptorController> acceptorControllers;

    public Logic() {
        this.session = new Session();
        this.acceptorControllers = new HashMap<>();
        this.acceptorControllers.put(StateValue.INITIAL, new StartController(this.session));
        this.acceptorControllers.put(StateValue.IN_GAME, new ProposalController(this.session));
        this.acceptorControllers.put(StateValue.FINAL, new ResumeController(this.session));
        this.acceptorControllers.put(StateValue.EXIT, null);
    }

    public AcceptorController getController() {
        return this.acceptorControllers.get(this.session.getValueState());
    }

}
