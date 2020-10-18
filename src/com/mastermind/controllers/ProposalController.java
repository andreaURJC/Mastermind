package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.ProposedCombination;
import com.mastermind.models.Result;
import com.mastermind.models.State;

public class ProposalController extends UserCaseController {
    public ProposalController(Game game, State state) {
        super(game, state);
    }


    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.game.addProposedCombination(proposedCombination);
    }

    public int getAttempts() {
        return this.game.getAttempts();
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.game.getProposedCombination(position);
    }

    public Result getResult(int position) {
        return this.game.getResult(position);
    }

    public boolean isWinner() {
        return this.game.isWinner();
    }

    public boolean isLooser() {
        return this.game.isLooser();
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
