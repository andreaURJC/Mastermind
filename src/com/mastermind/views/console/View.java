package com.mastermind.views.console;

import com.mastermind.controllers.ProposalController;
import com.mastermind.controllers.ResumeController;

public class View extends com.mastermind.views.View {
    private StartView startView;

    private ProposalView proposalView;

    private ResumeView resumeView;

    public View(ProposalController proposalController, ResumeController resumeController) {
        this.startView = new StartView();
        this.proposalView = new ProposalView(proposalController);
        this.resumeView = new ResumeView(resumeController);
    }

    @Override
    protected void start() {
        this.startView.interact();
    }

    @Override
    protected boolean play() {
        return this.proposalView.interact();
    }

    @Override
    protected boolean resume() {
        return this.resumeView.interact();
    }

}
