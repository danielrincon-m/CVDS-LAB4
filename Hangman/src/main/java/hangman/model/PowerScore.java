package hangman.model;

public class PowerScore implements GameScore {
    /**
     * {@inheritDoc}
     * @pos El Score mayor o igual a cero y menor o igual a 500
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws IllegalArgumentException {
        int score = 0;
        for (int i = 0; i < correctCount; i++) {
            score += Math.pow(5, i);
        }
        score -= incorrectCount * 8;
        return Math.max(Math.min(score, 500), 0);
    }
}
