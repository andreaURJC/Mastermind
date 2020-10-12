package utils;

public class Random {
    java.util.Random random = new java.util.Random();

    public int generateRandom(int bounds) {
        int randomInt = random.nextInt(bounds);
        return randomInt;
    }
}
