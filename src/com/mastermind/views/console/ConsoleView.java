package com.mastermind.views.console;

import com.mastermind.controllers.ProposalController;
import com.mastermind.controllers.ResumeController;
import com.mastermind.controllers.StartController;
import com.mastermind.views.View;

public class ConsoleView extends View {

    private StartView startView;

    private ProposalView proposalView;

    private ResumeView resumeView;

    public ConsoleView(){
        this.startView = new StartView();
        this.proposalView = new ProposalView();
        this.resumeView = new ResumeView();
    }


    public void visit(StartController startController) {
        this.startView.interact(startController);
    }


    public void visit(ProposalController proposalController) {
        this.proposalView.interact(proposalController);
    }


    public void visit(ResumeController resumeController) {
        this.resumeView.interact(resumeController);
    }

}
