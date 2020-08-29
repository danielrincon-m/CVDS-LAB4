package hangman.model;

public class BonusScore implements GameScore {
    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws IllegalArgumentException {
        return Math.max(correctCount * 10 - incorrectCount * 5, 0);
    }
}
