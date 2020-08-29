package hangman.model;

public class PowerScore implements GameScore {
    /**
     * {@inheritDoc}
     * @pos El Score mayor o igual a cero y menor o igual a 500
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
