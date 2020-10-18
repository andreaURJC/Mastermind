package com.mastermind;

import com.mastermind.controllers.Logic;
import com.mastermind.views.graphics.View;

public class MastermindGraphics extends Mastermind {
    @Override
    protected com.mastermind.views.View createView(Logic logic) {
        return new View(logic);
    }

    public static void main(String[] args) {
        new MastermindGraphics().play();
    }
}
