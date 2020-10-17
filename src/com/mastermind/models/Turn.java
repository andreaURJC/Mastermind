package com.mastermind.models;

import com.mastermind.models.Board;
import com.mastermind.models.Combination;
import com.mastermind.models.MachineCodeMakerPlayer;
import com.mastermind.models.Result;

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
