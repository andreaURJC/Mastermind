package com.mastermind.models;

import com.mastermind.Combination;
import com.mastermind.Result;
import com.mastermind.Turn;
import utils.Console;

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

    public Turn getTurn() {
        return turn;
    }

    public boolean isBoardCompleted() {
        return this.board.isCompleted();
    }

    public boolean isMastermindGuessed() {
        return this.board.isWinner();
    }

    public boolean isSecretCombinationSet() { return this.board.getSecretCombination() != null; }

    public void putSecretCombination() {
        Combination secretCombination = turn.machineCodeMakerPlayerGenerateSecretCombination();
        board.setSecretCombination(secretCombination);
    }
}
