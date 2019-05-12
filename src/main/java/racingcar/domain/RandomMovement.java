package racingcar.domain;

import java.util.Random;

public class RandomMovement implements MovementStrategy {
    private static final int MOVE_THRES = 4;
    private static final int MAX_RAND = 9;

    public boolean isMovable() {
        Random random = new Random();
        return random.nextInt(MAX_RAND + 1) >= MOVE_THRES;
    }
}