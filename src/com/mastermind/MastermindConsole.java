package com.mastermind;

import com.mastermind.controllers.Logic;
import com.mastermind.views.console.View;

class MastermindConsole extends Mastermind {
    @Override
    protected com.mastermind.views.View createView(Logic logic) {
        return new View(logic);
    }

    public static void main(String[] args) {
        new MastermindConsole().play();
    }

}
