package com.mastermind;

public class Mastermind {


    public static void main(String[] args) {
        Board board = new Board();
        Turn turn = new Turn(board);

        play(board, turn);
    }

    private static void play(Board board, Turn turn) {
        do {
            turn.play();
        } while (!board.isWinner() || board.isLastAttempt());

        turn.publishGameResult();
    }

}
