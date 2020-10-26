package com.mastermind;

import com.mastermind.views.View;
import com.mastermind.views.graphics.GraphicsView;

public class MastermindGraphics extends Mastermind {

    protected View createView() {
        return new GraphicsView();
    }

    public static void main(String[] args) {
        new MastermindGraphics().play();
    }
}
