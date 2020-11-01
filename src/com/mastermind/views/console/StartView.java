package com.mastermind.views.console;

import com.mastermind.views.Message;
import utils.WithConsoleView;

public class StartView extends WithConsoleView {
    public void write() {
        Message.TITLE.writeln();
    }
}
