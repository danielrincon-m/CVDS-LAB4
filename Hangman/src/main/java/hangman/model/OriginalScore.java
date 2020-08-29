package hangman.model;

public class OriginalScore implements GameScore {
    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws IllegalArgumentException {
        return Math.max(100 - incorrectCount * 10, 0);
    }
}
