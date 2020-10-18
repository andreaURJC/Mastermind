package com.mastermind.controllers;

import com.mastermind.models.Game;
import com.mastermind.models.ProposedCombination;
import com.mastermind.models.Result;

public class Logic {
    private Game game;
    private ProposalController proposalController;
    private ResumeController resumeController;

    public Logic() {
        this.game = new Game();
        this.proposalController = new ProposalController(this.game);
        this.resumeController = new ResumeController(this.game);
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.proposalController.addProposedCombination(proposedCombination);
    }

    public ProposedCombination getProposedCombination(int position) {
        return this.proposalController.getProposedCombination(position);
    }

    public int getAttempts() {
        return this.proposalController.getAttempts();
    }

    public Result getResult(int position) {
        return this.proposalController.getResult(position);
    }

    public boolean isWinner() {
        return this.proposalController.isWinner();
    }

    public boolean isLooser() {
        return this.proposalController.isLooser();
    }

    public void clear() {
        this.resumeController.clear();
    }

}
