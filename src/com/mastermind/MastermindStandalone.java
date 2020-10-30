package com.mastermind;

import com.mastermind.controllers.Logic;
import com.mastermind.controllers.implementation.LogicImplementation;

public class MastermindStandalone extends Mastermind {
    @Override
    protected Logic createLogic() {
        return new LogicImplementation();
    }
    public static void main(String[] args) {
        new MastermindStandalone().play();
    }
}
