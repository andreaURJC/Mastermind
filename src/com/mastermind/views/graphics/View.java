package com.mastermind.views.graphics;

import com.mastermind.models.Game;

public class View extends com.mastermind.views.View {
    public View(Game game) {
        super(game);
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
