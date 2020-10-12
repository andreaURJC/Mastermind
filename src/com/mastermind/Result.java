package com.mastermind;

import java.util.List;

public class Result {

    public Result(List<Success> successes) {
        this.successes = successes;
    }

    public List<Success> getSuccesses() {
        return successes;
    }

    public void setSuccesses(List<Success> successes) {
        this.successes = successes;
    }

    List<Success> successes;
}
