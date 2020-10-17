package com.mastermind;

import com.mastermind.models.Board;
import utils.Console;

import java.util.stream.Collectors;

public class Turn {
    Board board;
    private MachineCodeMakerPlayer machineCodeMakerPlayer;

    public Turn(Board board) {
        this.board = board;
        this.machineCodeMakerPlayer = new MachineCodeMakerPlayer(board);
    }

    public Combination machineCodeMakerPlayerGenerateSecretCombination() {
        return machineCodeMakerPlayer.generateCombination();
    }

    public Result getCodeMakerResult() {
       return machineCodeMakerPlayer.checkCombination();
    }
}
