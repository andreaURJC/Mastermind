package com.mastermind.views.graphics;

import com.mastermind.controllers.Logic;
import com.mastermind.controllers.ProposalController;
import com.mastermind.controllers.ResumeController;

public class View extends com.mastermind.views.View {
    public View(Logic logic) {
    }

    @Override
    protected void start() {
        //Graphics for startView
    }

    @Override
    protected boolean play() {
        //Graphics for proposalView
        return false;
    }

    @Override
    protected boolean resume() {
        //Graphics for resumeView
        return false;
    }
}
