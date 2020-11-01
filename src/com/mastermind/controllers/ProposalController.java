package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.ProposedCombination;
import com.mastermind.models.State;
import com.mastermind.views.console.ProposedCombinationView;
import utils.Console;

public class ProposalController extends InGameController {
    public ProposalController(Game game, State state) {
        super(game, state);
    }

    @Override
    protected void inGameControl() {
        this.proposeCombination();
    }

    private void proposeCombination() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.game.addProposedCombination(proposedCombination);
        Console console = new Console();
        console.writeln();
    }

}
