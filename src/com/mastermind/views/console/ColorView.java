package com.mastermind.views.console;

import com.mastermind.types.Color;
import utils.Console;
import utils.WithConsoleView;

class ColorView extends com.mastermind.views.ColorView {

    ColorView(Color color) {
        super(color);
    }

    void write() {
        new Console().write(ColorView.INITIALS[this.color.ordinal()]);
    }

}