package com.mastermind.models;

import com.mastermind.types.Color;
import com.mastermind.types.Error;

import java.util.List;

public class Session {

    private Registry registry;
    private Game game;
    private State state;

    public Session() {
        this.game = new Game();
        this.state = new State();
        this.registry = new Registry(this.game);
    }

    public void next() {
        this.state.next();
    }

    public void clear() {
        this.game.clear();
    }

    public void reset() {
        this.state.reset();
        this.registry.reset();
    }

    public boolean redoable() {
        return this.registry.redoable();
    }

    public void redo() {
        this.registry.redo(game);
    }

    public void undo() {
        this.registry.undo(game);
    }

    public boolean undoable() {
        return this.registry.undoable();
    }

    public Error addProposedCombination(List<Color> colors) {
        Error error = null;
        if (colors.size() != Combination.getWidth()) {
            error = Error.WRONG_LENGTH;
        } else {
            for (int i = 0; i < colors.size(); i++) {
                if (colors.get(i) == null) {
                    error = Error.WRONG_CHARACTERS;
                } else {
                    for (int j = i + 1; j < colors.size(); j++) {
                        if (colors.get(i) == colors.get(j)) {
                            error = Error.DUPLICATED;
                        }
                    }
                }
            }
        }
        if (error == null) {
            this.game.addProposedCombination(colors);
            this.registry.register();
            if (this.game.isWinner() || this.game.isLooser()) {
                this.state.next();
            }
        }
        return error;
    }

    public boolean isWinner() {
        return this.game.isWinner();
    }

    public boolean isLooser() {
        return this.game.isLooser();
    }

    public int getAttempts() {
        return this.game.getAttempts();
    }

    public List<Color> getColors(int position) {
        return this.game.getColors(position);
    }

    public int getBlacks(int position) {
        return this.game.getBlacks(position);
    }

    public int getWhites(int position) {
        return this.game.getWhites(position);
    }

    public StateValue getValueState() {
        return state.getValueState();
    }

    public int getWidth() {
        return this.game.getWidth();
    }
}
