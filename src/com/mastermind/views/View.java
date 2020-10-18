package com.mastermind.views;

import com.mastermind.models.Game;

public abstract class View {

    public void interact() {
        boolean newGame;
        do {
            this.start();
            boolean finished;
            do {
                finished = this.play();
            } while (!finished);
            newGame = this.resume();
        } while (newGame);
    }

    protected abstract void start();
    protected abstract boolean play();
    protected abstract boolean resume();

}

