package com.mastermind;

import utils.Console;

import java.util.stream.Collectors;

public class Turn {
    Board board;
    private MachineCodeMakerPlayer machineCodeMakerPlayer;
    private CodeBreakerPlayer codeBreakerPlayer = new CodeBreakerPlayer();
    private Console console = Console.instance();

    public Turn(Board board) {
        this.board = board;
        this.machineCodeMakerPlayer = new MachineCodeMakerPlayer(board);
    }

    public void play() {
        if (board.getSecretCombination() == null) {
            this.printWelcomeMessage();
            board.setSecretCombination(machineCodeMakerPlayer.generateCombination());
            console.writeLine(board.getSecretCombination().getCombination().toString());
        } else {
            Combination newCombination = codeMakerCreateNewCombination();
            board.putCombination(newCombination);
            Result result = machineCodeMakerPlayer.checkCombination();
            board.setResult(result);
            printResult(result);
        }
    }

    public void publishGameResult() {
        if (board.isWinner()) {
            console.writeLine(Message.YOU_WON.getMessage());
        } else {
            console.writeLine(Message.YOU_LOST.getMessage());
        }
    }

    private Combination codeMakerCreateNewCombination() {
        Combination combination;
        combination = codeBreakerPlayer.putCombination();

        return combination;
    }

    private void printWelcomeMessage() {
        console.writeLine(Message.MASTERMIND.getMessage());
    }

    private void printResult(Result result) {
        int blackItems = result.getSuccesses().stream().filter(success -> success == Success.BLACK).collect(Collectors.toList()).size();
        int whiteItems = result.getSuccesses().stream().filter(success -> success == Success.WHITE).collect(Collectors.toList()).size();
        console.writeLine("Black pins: " + blackItems + "and white pins: " + whiteItems);
    }

}
