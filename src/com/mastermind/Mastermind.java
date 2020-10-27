package com.mastermind;

import com.mastermind.controllers.AcceptorController;
import com.mastermind.controllers.Logic;
import com.mastermind.views.console.View;

class Mastermind {

    private Logic logic;
    private View view;

    protected Mastermind() {
        this.logic = new Logic();
        this.view = new View();
    }

    protected void play() {
        AcceptorController acceptorController;

        do {
            acceptorController = this.logic.getController();
            if (acceptorController != null) {
                this.view.interact(acceptorController);
            }
        } while (acceptorController != null);
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

}
