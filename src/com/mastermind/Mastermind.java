package com.mastermind;

import com.mastermind.controllers.AcceptorController;
import com.mastermind.controllers.Logic;
import com.mastermind.views.console.View;

public abstract class Mastermind {

    private Logic logic;
    private View view;

    protected Mastermind() {
        this.logic = this.createLogic();
        this.view = new View();
    }

    protected abstract Logic createLogic();
    protected void play() {
        AcceptorController acceptorController;

        do {
            acceptorController = this.logic.getController();
            if (acceptorController != null) {
                this.view.interact(acceptorController);
            }
        } while (acceptorController != null);
    }

}
