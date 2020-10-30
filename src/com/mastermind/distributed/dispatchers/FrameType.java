package com.mastermind.distributed.dispatchers;

public enum FrameType {
    START,
    NEW_GAME,
    UNDO,
    REDO,
    UNDOABLE,
    REDOABLE,
    WIDTH,
    WINNER,
    LOOSER,
    ATTEMPTS,
    COLORS,
    BLACKS,
    WHITES,
    PROPOSED_COMBINATION_ERROR,
    CLOSE;

    public static FrameType parser(String string) {
        for(FrameType frameType : FrameType.values()) {
            if (frameType.name().equals(string)) {
                return frameType;
            }
        }
        return null;
    }
}
