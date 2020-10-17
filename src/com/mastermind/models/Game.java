package com.mastermind.models;

public class Game {
    public Board getBoard() {
        return board;
    }

    private Board board;
    private Turn turn;

    public Game() {
        board = new Board();
        turn = new Turn(this.board);
    }

    public void putSecretCombination() {
        Combination secretCombination = turn.machineCodeMakerPlayerGenerateSecretCombination();
        board.setSecretCombination(secretCombination);
    }

    public void putCombination(Combination combination) {
        board.putCombination(combination);
        Result result = turn.getCodeMakerResult();
        board.setResult(result);
    }

    public boolean isBoardCompleted() {
        return this.board.isCompleted();
    }

    public boolean isMastermindGuessed() {
        return this.board.isWinner();
    }

    public boolean isSecretCombinationSet() {
        return this.board.getSecretCombination() != null;
    }

    public boolean isWinner() {
        return board.isWinner();
    }

    public void resetGame() {
        board = new Board();
        turn = new Turn(this.board);
    }

    public int getAttempts() {
        return this.board.getAttempts();
    }
}
