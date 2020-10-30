package com.mastermind.controllers;

import com.mastermind.controllers.implementation.SessionImplementation;
import com.mastermind.models.Session;
import com.mastermind.types.Color;
import com.mastermind.types.Error;

import java.util.List;

public class MovementController {
    private SessionImplementation sessionImplementation;

    public MovementController(Session session) {
        this.sessionImplementation = (SessionImplementation) session;
    }

    public boolean isWinner() {
        return sessionImplementation.isWinner();
    }

    public boolean isLooser() {
        return sessionImplementation.isLooser();
    }

    public int getAttempts() {
        return sessionImplementation.getAttempts();
    }

    public List<Color> getColors(int position) {
        return sessionImplementation.getColors(position);
    }

    public int getBlacks(int position) {
        return this.sessionImplementation.getBlacks(position);
    }

    public int getWhites(int position) {
        return sessionImplementation.getWhites(position);
    }

    public Error addProposedCombination(List<Color> colors) {
        return sessionImplementation.addProposedCombination(colors);
    }

    public int getWidth() {
        return sessionImplementation.getWidth();
    }

}
