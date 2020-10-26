package com.mastermind.views;

import com.mastermind.controllers.ControllersVisitor;
import com.mastermind.controllers.Controller;

public abstract class View implements ControllersVisitor {

    public void interact(Controller controller) {
        controller.accept(this);
    }

}

