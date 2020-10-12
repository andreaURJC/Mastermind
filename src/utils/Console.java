package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Console {
    public static Console console;

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static Console instance() {
        if( console == null) {
            return Console.console = new Console();
        }
        return Console.console;
    }

    public String readString(String title) {
        String input = null;
        this.writeLine(title);
        try{
            input = this.bufferedReader.readLine();

        } catch (Exception e) {

        }

        return input;
    }

    public void writeLine(String message) {
        System.out.println(message);
    }
    public void writeLine() {
        System.out.println();
    }

    public void write(int integer) {
        System.out.println(integer);
    }

    public void write(char character) {
        System.out.println(character);
    }

    public void printError(String error) {
        System.out.println(error);
    }
}
