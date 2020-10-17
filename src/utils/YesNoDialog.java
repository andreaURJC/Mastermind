package utils;

import com.mastermind.models.Message;

public class YesNoDialog {
    private static final char AFFIRMATIVE = 'y';
    private static final char NEGATIVE = 'n';

    private char answer;

    public YesNoDialog() {
    }

    public boolean read() {
        Console console = Console.instance();

        do {
            Message.RESUME.writeLine();
            this.answer = console.readChar();
        } while (isAffirmative() || isNegative());

        return this.isAffirmative();
    }

    private boolean isAffirmative() {
        return this.answer == AFFIRMATIVE;
    }

    private boolean isNegative() {
        return this.answer == NEGATIVE;
    }


}
