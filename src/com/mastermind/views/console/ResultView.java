package com.mastermind.views.console;

import com.mastermind.controllers.ProposalController;
import com.mastermind.views.Message;
import utils.WithConsoleView;

class ResultView extends WithConsoleView {

    private ProposalController proposalController;

    ResultView(ProposalController proposalController){
        this.proposalController = proposalController;
    }

    void writeln(int i) {
        this.console.writeln(Message.RESULT.getMessage()
                .replaceFirst("#blacks", "" + this.proposalController.getBlacks(i))
                .replaceFirst("#whites", "" + this.proposalController.getWhites(i)));
    }

}

