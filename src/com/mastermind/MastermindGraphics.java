package com.mastermind;

import com.mastermind.controllers.ProposalController;
import com.mastermind.controllers.ResumeController;
import com.mastermind.views.graphics.View;

public class MastermindGraphics extends Mastermind {
    @Override
    protected com.mastermind.views.View createView(ProposalController proposalController, ResumeController resumeController) {
        return new View(proposalController, resumeController);
    }

    public static void main(String[] args) {
        new MastermindGraphics().play();
    }
}
