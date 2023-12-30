package exercise.kiwee.game.utils;

import org.apache.commons.lang3.RandomUtils;

public class Utilities {
    private Utilities() {
    }
    
    public int dice() {
        return RandomUtils.nextInt(1, 7) + RandomUtils.nextInt(1, 7);
    }
}
