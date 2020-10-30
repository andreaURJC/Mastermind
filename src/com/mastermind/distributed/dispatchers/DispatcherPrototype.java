package com.mastermind.distributed.dispatchers;

import java.util.HashMap;
import java.util.Map;

public class DispatcherPrototype {
    private TCPIP tcpip;
    private Map<FrameType, Dispatcher> dispatcherMap;

    public DispatcherPrototype() {
        this.tcpip = TCPIP.createServerSocket();
        this.dispatcherMap = new HashMap<>();
    }

    public void add(FrameType frameType, Dispatcher dispatcher) {
        this.dispatcherMap.put(frameType, dispatcher);
    }

    public void dispatch(FrameType frameType) {
        this.dispatcherMap.get(frameType).dispatch();
    }

    public void serve() {
        FrameType frameType;

        do {
            String string = this.tcpip.receiveLine();
            frameType = FrameType.parser(string);

            if (frameType != FrameType.CLOSE) {
                this.dispatch(frameType);
            }
        } while (frameType != FrameType.CLOSE);
        this.tcpip.close();
    }
}
