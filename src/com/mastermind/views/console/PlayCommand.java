package com.mastermind.views.console;

import com.mastermind.controllers.ProposalController;
import com.mastermind.types.Color;
import com.mastermind.types.Error;
import com.mastermind.views.Message;

import java.util.List;

public class PlayCommand extends Command {
    protected PlayCommand(ProposalController proposalController) {
        super(Message.ACTION_COMMAND.getMessage(), proposalController);
    }

    @Override
    protected void execute() {
        if (proposalController.getAttempts() > 0) {
            if (proposalController.isWinner()) {
                Message.WINNER.writeln();
            } else if (proposalController.isLooser()) {
                Message.LOOSER.writeln();
            } else {
                this.put(proposalController);
            }
        } else {
            this.put(proposalController);
        }
    }

    @Override
    protected boolean isActive() {
        return true;
    }

    private void put(ProposalController proposalController) {
        Error error;
        List<Color> colors;

        do {
            colors = new ProposedCombinationView(proposalController).read();
            error = proposalController.addProposedCombination(colors);
            new ErrorView(error).writeln();
        } while (error != null);
    }
}
