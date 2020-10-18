package com.mastermind;

import com.mastermind.controllers.Logic;
import com.mastermind.views.View;

public abstract class Mastermind {
    private View view;
    private Logic logic;

    protected Mastermind() {
        this.logic = new Logic();
        this.view = this.createView(this.logic);
    }

    protected abstract View createView(Logic logic);

    protected void play() {
        this.view.interact();
    }
}
