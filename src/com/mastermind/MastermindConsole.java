package com.mastermind;

import com.mastermind.controllers.ProposalController;
import com.mastermind.controllers.ResumeController;
import com.mastermind.views.console.View;

class MastermindConsole extends Mastermind {
    @Override
    protected com.mastermind.views.View createView(ProposalController proposalController, ResumeController resumeController) {
        return new View(proposalController, resumeController);
    }

    public static void main(String[] args) {
        new MastermindConsole().play();
    }

}
