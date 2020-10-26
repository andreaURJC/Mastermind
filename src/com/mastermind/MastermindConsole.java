package com.mastermind;

import com.mastermind.views.View;
import com.mastermind.views.console.ConsoleView;

class MastermindConsole extends Mastermind {
    protected View createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new MastermindConsole().play();
    }

}
