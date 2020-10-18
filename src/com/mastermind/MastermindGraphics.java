package com.mastermind;

import com.mastermind.models.Game;
import com.mastermind.views.graphics.View;

public class MastermindGraphics extends Mastermind {
    @Override
    protected com.mastermind.views.View createView(Game game) {
        return new View(game);
    }

    public static void main(String[] args) {
        new MastermindGraphics().play();
    }
}
