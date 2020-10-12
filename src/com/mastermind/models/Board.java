package com.mastermind.models;


import com.mastermind.Combination;
import com.mastermind.Result;
import com.mastermind.Success;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Board {
    private Combination secretCombination;
    private List<Combination> combinations = new ArrayList<>();
    private List<Result> results = new ArrayList<>();

    final int MAX_ATTEMPTS = 3;

    public Combination getSecretCombination() {
        return secretCombination;
    }

    public void setSecretCombination(Combination secretCombination) {
        this.secretCombination = secretCombination;
    }

    public boolean isWinner() {
        if (results.isEmpty()) {
            return false;
        }

        Result lastResult = results.get(results.size() - 1);
        if (lastResult.getSuccesses().stream().filter(success -> success == Success.BLACK).collect(Collectors.toList()).size() == 4) {
            return true;
        } else {
            return false;
        }
    }

    public void putCombination(Combination combination) {
        this.combinations.add(combination);
    }

    public void setResult(Result result) {
        this.results.add(result);
    }

    public boolean isLastAttempt() {
        if (this.combinations.isEmpty()) {
            return false;
        }
        return this.combinations.size() == MAX_ATTEMPTS;
    }

    public Combination getLastCombination() {
        return combinations.get(combinations.size() - 1);
    }

    public int getAttempts() {
        return this.combinations.size();
    }

    public boolean isCompleted() {
        return this.combinations.size() == MAX_ATTEMPTS;
    }

    public Combination getCombinationAtIndex(int index) {
        return this.combinations.get(index);
    }

    public Result getResultAtIndex(int index) {
        return this.results.get(index);
    }
}
