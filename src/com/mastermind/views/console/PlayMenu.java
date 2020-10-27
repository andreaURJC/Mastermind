package com.mastermind.views.console;

import com.mastermind.controllers.ProposalController;
import utils.Menu;

public class PlayMenu extends Menu {
    public PlayMenu(ProposalController proposalController) {
        this.addCommand(new PlayCommand(proposalController));
        this.addCommand(new UndoCommand(proposalController));
        this.addCommand(new RedoCommand(proposalController));
    }
}
