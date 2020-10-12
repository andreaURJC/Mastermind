package com.mastermind;

import com.mastermind.models.Board;
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
            board.setSecretCombination(machineCodeMakerPlayer.generateCombination());
            console.writeLine(board.getSecretCombination().getCombination().toString());
        } else {
            Combination newCombination = codeMakerCreateNewCombination();
            board.putCombination(newCombination);
            Result result = machineCodeMakerPlayer.checkCombination();
            board.setResult(result);
        }
    }

    public void publishGameResult() {
        if (board.isWinner()) {
            console.writeLine(Message.YOU_WON.getMessage());
        } else {
            console.writeLine(Message.YOU_LOST.getMessage());
        }
    }

    public Combination codeMakerCreateNewCombination() {
        Combination combination;
        combination = codeBreakerPlayer.putCombination();

        return combination;
    }

    public Combination machineCodeMakerPlayerGenerateSecretCombination() {
        return machineCodeMakerPlayer.generateCombination();
    }

    public Result machineCodeMakerCheckResult() {
       return machineCodeMakerPlayer.checkCombination();
    }
}
