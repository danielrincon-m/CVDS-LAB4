package hangman.model;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class BonusScore implements GameScore {
    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
