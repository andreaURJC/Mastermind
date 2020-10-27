package com.mastermind.models;

import java.util.List;

public class Memento {

    private SecretCombination secretCombination;
    private List<ProposedCombination> proposedCombinations;
    private List<Result> results;
    private int attempts;

    public Memento(SecretCombination secretCombination, List<ProposedCombination> proposedCombinations, List<Result> results, int attempts) {
        this.secretCombination = secretCombination;
        this.proposedCombinations = proposedCombinations;
        this.results = results;
        this.attempts = attempts;
    }

    public SecretCombination getSecretCombination() {
        return secretCombination;
    }

    public List<Result> getResults() {
        return results;
    }

    public List<ProposedCombination> getProposedCombinations() {
        return proposedCombinations;
    }

    public int getAttempts() {
        return attempts;
    }
}
