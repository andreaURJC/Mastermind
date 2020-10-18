package com.mastermind;

import com.mastermind.models.Game;
import com.mastermind.views.graphics.View;

public class MastermindGraphics {

    private Game game;

    private View view;

    private MastermindGraphics() {
        this.game = new Game();
        this.view = new View(game);
    }

    private void play() {
        this.view.interact();
    }

    public static void main(String[] args) {
        new MastermindGraphics().play();
    }

}
