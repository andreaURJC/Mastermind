package com.mastermind;

import com.mastermind.models.Game;
import com.mastermind.views.console.View;

class MastermindConsole {
    private Game game;

    private View view;

    private MastermindConsole() {
        this.game = new Game();
        this.view = new View(game);
    }

    private void play() {
        this.view.interact();
    }

    public static void main(String[] args) {
        new MastermindConsole().play();
    }

}
