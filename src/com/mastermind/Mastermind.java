package com.mastermind;

import com.mastermind.models.Game;
import com.mastermind.views.View;

public class Mastermind {
    private Game game;
    private View view;

    public Mastermind() {
        game = new Game();
        view = new View(this.game);
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

    private void play() {
        this.view.interact();
    }

}
