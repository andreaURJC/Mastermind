package com.mastermind.views.console;

import com.mastermind.controllers.*;

public class View extends com.mastermind.views.View {
    private StartView startView;

    private ProposalView proposalView;

    private ResumeView resumeView;

    public View() {
        this.startView = new StartView();
        this.proposalView = new ProposalView();
        this.resumeView = new ResumeView();
    }

    @Override
    public void interact(Controller controller) {
        if (controller instanceof StartController) {
            this.startView.interact((StartController) controller);
        } else {
            if (controller instanceof ProposalController) {
                this.proposalView.interact((ProposalController) controller);
            } else {
                this.resumeView.interact((ResumeController) controller);
            }
        }
    }
}
