package com.mastermind.views;

import com.mastermind.models.Message;
import com.mastermind.models.Result;
import com.mastermind.models.Success;
import utils.Console;

import java.util.stream.Collectors;

public class ResultView {
    Result result;

    public ResultView(Result result) {
        this.result = result;
    }

    void write() {
        int blackItems = result.getSuccesses().stream().filter(success -> success == Success.BLACK).collect(Collectors.toList()).size();
        int whiteItems = result.getSuccesses().stream().filter(success -> success == Success.WHITE).collect(Collectors.toList()).size();
        Console.instance().writeLine(Message.BLACK_ITEMS.toString() + blackItems + Message.AND.toString() + Message.WHITE_ITEMS.toString() + whiteItems);
    }
}
