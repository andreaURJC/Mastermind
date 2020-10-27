package com.mastermind.controllers;

import com.mastermind.models.ProposedCombination;
import com.mastermind.models.Session;
import com.mastermind.types.Color;
import com.mastermind.types.Error;

import java.util.List;

public class MovementController {
    private Session session;

    public MovementController(Session session) {
        this.session = session;
    }

    public boolean isWinner() {
        return session.isWinner();
    }

    public boolean isLooser() {
        return session.isLooser();
    }

    public int getAttempts() {
        return session.getAttempts();
    }

    public List<Color> getColors(int position) {
        return session.getColors(position);
    }

    public int getBlacks(int position) {
        return this.session.getBlacks(position);
    }

    public int getWhites(int position) {
        return session.getWhites(position);
    }

    public Error addProposedCombination(List<Color> colors) {
        return session.addProposedCombination(colors);
    }

    public int getWidth() {
        return session.getWidth();
    }

}
