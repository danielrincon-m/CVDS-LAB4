package hangman.model;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class OriginalScore implements GameScore {
    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws InvalidArgumentException {
        return 0;
    }
}
