package com.mastermind.views.console;

import com.mastermind.models.Result;
import com.mastermind.views.Message;
import utils.WithConsoleView;

public class ResultView extends WithConsoleView {

    private Result result;

    public ResultView(Result result) {
        this.result = result;
    }

    public void writeln() {
        Message.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
    }

}

