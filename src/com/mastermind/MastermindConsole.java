package com.mastermind;

import com.mastermind.views.console.View;

class MastermindConsole extends Mastermind {
    @Override
    protected com.mastermind.views.View createView() {
        return new View();
    }

    public static void main(String[] args) {
        new MastermindConsole().play();
    }

}
