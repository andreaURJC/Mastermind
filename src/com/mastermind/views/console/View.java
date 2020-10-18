package com.mastermind.views.console;

import com.mastermind.models.Game;

public class View extends com.mastermind.views.View {

    protected Game game;

    private StartView startView;

    private ProposalView proposalView;

    private ResumeView resumeView;

    public View(Game game) {
        super(game);
        this.startView = new StartView();
        this.proposalView = new ProposalView(this.game);
        this.resumeView = new ResumeView(this.game);
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
