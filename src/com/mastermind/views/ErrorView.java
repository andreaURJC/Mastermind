package com.mastermind.views;

import com.mastermind.views.console.ColorView;

public class ErrorView {
    protected static final String[] MESSAGES = {
            "Repeated colors",
            "Wrong colors, they must be: " + ColorView.allInitials(),
            "Wrong proposed combination length" };
}
