package com.mastermind.controllers.implementation;

import com.mastermind.controllers.Logic;
import com.mastermind.models.StateValue;

public class LogicImplementation extends Logic {

    protected StartControllerImplementation startControllerImplementation;
    protected ProposalControllerImplementation proposalControllerImplementation;
    protected ResumeControllerImplementation resumeControllerImplementation;

    public LogicImplementation() {
        this.session = new SessionImplementation();
        this.startControllerImplementation = new StartControllerImplementation(this.session);
        this.proposalControllerImplementation = new ProposalControllerImplementation(this.session);
        this.resumeControllerImplementation = new ResumeControllerImplementation(this.session);

        this.acceptorControllers.put(StateValue.INITIAL, startControllerImplementation);
        this.acceptorControllers.put(StateValue.IN_GAME, proposalControllerImplementation);
        this.acceptorControllers.put(StateValue.FINAL, resumeControllerImplementation);
        this.acceptorControllers.put(StateValue.EXIT, null);
    }
}
