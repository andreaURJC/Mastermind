package com.mastermind;

import com.mastermind.views.graphics.View;

public class MastermindGraphics extends Mastermind {
    @Override
    protected com.mastermind.views.View createView() {
        return new View();
    }

    public static void main(String[] args) {
        new MastermindGraphics().play();
    }
}
