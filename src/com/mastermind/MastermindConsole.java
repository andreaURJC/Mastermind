package com.mastermind;

import com.mastermind.models.Game;
import com.mastermind.views.console.View;

class MastermindConsole extends Mastermind {
    @Override
    protected com.mastermind.views.View createView(Game game) {
        return new View(game);
    }

    public static void main(String[] args) {
        new MastermindConsole().play();
    }

}
