package com.mastermind.controllers;

import com.mastermind.models.*;

import java.util.HashMap;
import java.util.Map;

public class Logic {
    private Game game;
    private State state;
    private Map<StateValue, UserCaseController> controllers;

    public Logic() {
        this.game = new Game();
        this.state = new State();
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.INITIAL, new StartController(this.game, this.state));
        this.controllers.put(StateValue.IN_GAME, new ProposalController(this.game, this.state));
        this.controllers.put(StateValue.RESUME, new ResumeController(this.game, this.state));
        this.controllers.put(StateValue.EXIT, null);
    }

    public UserCaseController getController() {
        return controllers.get(this.state.getStateValue());
    }


}
