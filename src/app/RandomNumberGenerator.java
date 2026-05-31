package app;

import java.util.Random;

public class RandomNumberGenerator {

    static int generateRandomNumber(int min, int max) {
        return new Random().nextInt(min, max);
    }
}
