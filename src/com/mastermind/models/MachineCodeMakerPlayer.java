package com.mastermind.models;

import utils.Random;

import java.util.ArrayList;
import java.util.List;

public class MachineCodeMakerPlayer {
    Board board;

    public MachineCodeMakerPlayer(Board board) {
        this.board = board;
    }

    public Combination generateCombination() {
        Random random = new Random();
        Color[] colors = Color.values();
        List<Color> colorList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Color color = colors[random.generateRandom(colors.length)];
            colorList.add(color);
        }
        Combination combination = new Combination(colorList);
        return combination;
    }

    public Result checkCombination() {
        Combination combination = board.getLastCombination();
        Combination secretCombination = board.getSecretCombination();

        List<Success> blackSuccess = checkBlackSuccess(combination, secretCombination);

        if (blackSuccess.size() == 4) {
            return new Result(blackSuccess);
        }

        combination.getCombination().stream().distinct();

        List<Success> whiteSuccess = checkWhiteSuccess(combination, secretCombination);

        List<Success> successes = new ArrayList<>();
        successes.addAll(blackSuccess);
        successes.addAll(whiteSuccess);

        return new Result(successes);

    }

    private List<Success> checkBlackSuccess(Combination combination, Combination secretCombination) {
        List<Success> successes = new ArrayList<>();
        int size = secretCombination.getCombination().size();

        for (int i = 0; i < size; i++) {
            if (combination.getCombination().get(i) == secretCombination.getCombination().get(i)) {
                successes.add(Success.BLACK);
            }
        }
        return successes;
    }

    private List<Success> checkWhiteSuccess(Combination combination, Combination secretCombination) {
        List<Success> successes = new ArrayList<>();

        for (int i = 0; i < secretCombination.getCombination().size(); i++) {
            for (int j = 0; j < combination.getCombination().size(); j++) {
                if (combination.getCombination().get(i) == secretCombination.getCombination().get(j)) {
                    successes.add(Success.WHITE);
                }
            }
        }
        return successes;
    }

}
