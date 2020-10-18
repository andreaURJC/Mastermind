package com.mastermind.views.console;

import com.mastermind.models.Result;
import com.mastermind.views.Message;
import utils.WithConsoleView;

class ResultView extends WithConsoleView {

    private Result result;

    ResultView(Result result) {
        this.result = result;
    }

    void writeln() {
        Message.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
    }

}

