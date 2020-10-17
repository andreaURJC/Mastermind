package com.mastermind.models;


import java.util.ArrayList;
import java.util.List;

public class Board {
    private Combination secretCombination;
    private List<Combination> combinations;
    private List<Result> results;

    public Board() {
        this.secretCombination = null;
        this.combinations = new ArrayList<>();;
        this.results = new ArrayList<>();;
    }

    final int MAX_ATTEMPTS = 3;

    public boolean isWinner() {
        if (results.isEmpty()) {
            return false;
        }
        Result lastResult = results.get(results.size() - 1);
        return lastResult.isWinnerResult();
    }

    public boolean isLastAttempt() {
        if (this.combinations.isEmpty()) {
            return false;
        }
        return this.combinations.size() == MAX_ATTEMPTS;
    }

    public void putCombination(Combination combination) {
        this.combinations.add(combination);
    }

    public void setResult(Result result) {
        this.results.add(result);
    }

    public Combination getSecretCombination() {
        return secretCombination;
    }

    public void setSecretCombination(Combination secretCombination) {
        this.secretCombination = secretCombination;
    }

    public Combination getLastCombination() {
        return combinations.get(combinations.size() - 1);
    }

    public int getAttempts() {
        return this.combinations.size();
    }

    public boolean isCompleted() {
        return this.getAttempts() == MAX_ATTEMPTS;
    }

    public Combination getCombinationAtIndex(int index) {
        return this.combinations.get(index);
    }

    public Result getResultAtIndex(int index) {
        return this.results.get(index);
    }
}
