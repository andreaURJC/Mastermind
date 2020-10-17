package com.mastermind;

import java.util.List;

public class Result {

    List<Success> successes;

    public Result(List<Success> successes) {
        this.successes = successes;
    }

    public List<Success> getSuccesses() {
        return successes;
    }

    public boolean isWinnerResult() {
        return this.getSuccesses().stream().filter(success -> success == Success.BLACK).count() == 4;
    }
}
