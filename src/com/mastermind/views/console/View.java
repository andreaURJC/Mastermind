package com.mastermind.views.console;

import com.mastermind.controllers.Logic;

public class View extends com.mastermind.views.View {
    private StartView startView;

    private ProposalView proposalView;

    private ResumeView resumeView;

    public View(Logic logic) {
        this.startView = new StartView();
        this.proposalView = new ProposalView(logic);
        this.resumeView = new ResumeView(logic);
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
