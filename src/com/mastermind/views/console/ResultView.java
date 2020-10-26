package com.mastermind.views.console;

import com.mastermind.controllers.ProposalController;
import com.mastermind.models.Result;
import com.mastermind.views.Message;
import com.mastermind.views.MessageView;
import utils.WithConsoleView;

class ResultView extends WithConsoleView {

    private ProposalController proposalController;

    ResultView(ProposalController proposalController){
        this.proposalController = proposalController;
    }

    void writeln(int i) {
        this.console.writeln(MessageView.RESULT.getMessage()
                .replaceFirst("#blacks", "" + this.proposalController.getBlacks(i))
                .replaceFirst("#whites", "" + this.proposalController.getWhites(i)));
    }

}

