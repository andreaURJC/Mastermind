package com.mastermind.views.console;

import com.mastermind.models.Color;
import com.mastermind.models.Combination;
import com.mastermind.models.ProposedCombination;
import com.mastermind.views.Message;
import utils.WithConsoleView;
import com.mastermind.models.Error;

public class ProposedCombinationView extends WithConsoleView {

    private ProposedCombination proposedCombination;

    public ProposedCombinationView(ProposedCombination proposedCombination) {
        this.proposedCombination = proposedCombination;
    }

    public void write() {
        for (Color color: this.proposedCombination.getColors()) {
            new ColorView(color).write();
        }
    }

    public void read() {
        Error error;
        do {
            error = null;
            Message.PROPOSED_COMBINATION.write();
            String characters = this.console.readString();
            if (characters.length() > Combination.getWidth()) {
                error = Error.WRONG_LENGTH;
            } else {
                for (int i = 0; i < characters.length(); i++) {
                    Color color = ColorView.getInstance(characters.charAt(i));
                    if (color == null) {
                        error = Error.WRONG_CHARACTERS;
                    } else {
                        if (this.proposedCombination.getColors().contains(color)) {
                            error = Error.DUPLICATED;
                        } else {
                            this.proposedCombination.getColors().add(color);
                        }
                    }
                }
            }
            if (error != null) {
                new ErrorView(error).writeln();
                this.proposedCombination.getColors().clear();
            }
        } while (error != null);
    }

}

