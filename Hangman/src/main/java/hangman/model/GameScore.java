package hangman.model;

public interface GameScore {
    /**
     * @pre Los argumentos son mayores o iguales a cero
     * @pos El Score mayor o igual a cero
     * @param correctCount El número de correctas en la palabra
     * @param incorrectCount El número de incorrectas en la palabra
     * @return El puntaje de la palabra
     * @throws IllegalArgumentException Cuando los argumentos no cumplen con la precondición
     */
    int calculateScore(int correctCount, int incorrectCount) throws IllegalArgumentException;
}
