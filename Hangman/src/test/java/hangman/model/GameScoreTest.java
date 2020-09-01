/*
OriginalScore:
    - Cero letras incorrectas -> 100
    - 0 < letras incorrectas < 10 -> (0, 100)
    - >= 10 letras incorrectas -> 0

BonusScore:
    - letras incorrectas / 2 = letras correctas -> 0
    - letras incorrectas / 2 > letras correctas -> 0
    - letras incorrectas / 2 < letras correctas -> > 0

PowerScore:
    - Bonificación > penalización -> 0 <= puntaje <= 500
    - Bonificación >> penalización -> 500
    - Bonificación < penalización -> 0
 */
package hangman.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class GameScoreTest {

    @Test
    public void originalScoreTest() throws IllegalArgumentException {
        GameScore originalScore = new OriginalScore();
        int caseOne = originalScore.calculateScore(5, 0);
        int caseTwoLowBound = originalScore.calculateScore(0, 1);
        int caseTwo = originalScore.calculateScore(0, 5);
        int caseTwoHighBound = originalScore.calculateScore(0, 9);
        int caseThree = originalScore.calculateScore(0, 10);

        assertEquals(100, caseOne);
        assertEquals(90, caseTwoLowBound);
        assertTrue(caseTwo > 0 && caseTwo < 100);
        assertEquals(10, caseTwoHighBound);
        assertEquals(0, caseThree);
    }

    @Test
    public void bonusScoreTest() throws IllegalArgumentException {
        GameScore bonusScore = new BonusScore();
        int caseOne = bonusScore.calculateScore(2, 4);
        int caseTwo = bonusScore.calculateScore(2, 6);
        int caseThreeBound = bonusScore.calculateScore(3, 4);
        int caseThree = bonusScore.calculateScore(10, 4);

        assertEquals(0, caseOne);
        assertEquals(0, caseTwo);
        assertTrue(caseThreeBound > 0);
        assertTrue(caseThree > 0);
    }

    @Test
    public void powerScoreTest() throws IllegalArgumentException {
        GameScore powerScore = new PowerScore();
        int caseOne = powerScore.calculateScore(2, 1);
        int caseTwo = powerScore.calculateScore(100, 0);
        int caseThree = powerScore.calculateScore(0, 2);

        assertTrue(caseOne >= 0 && caseOne <= 500);
        assertEquals(caseTwo, 500);
        assertEquals(0, caseThree);
    }
}