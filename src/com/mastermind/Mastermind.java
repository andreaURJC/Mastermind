package com.mastermind;

import com.mastermind.controllers.ProposalController;
import com.mastermind.controllers.ResumeController;
import com.mastermind.models.Game;
import com.mastermind.views.View;

public abstract class Mastermind {
    private Game game;
    private View view;
    private ProposalController proposalController;
    private ResumeController resumeController;

    protected Mastermind() {
        this.game = new Game();
        this.proposalController = new ProposalController(this.game);
        this.resumeController = new ResumeController(this.game);
        this.view = this.createView(proposalController, resumeController);
    }

    protected abstract View createView(ProposalController proposalController, ResumeController resumeController);

    protected void play() {
        this.view.interact();
    }
}
