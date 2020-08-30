package hangman.setup.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import hangman.model.BonusScore;
import hangman.model.GameScore;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import hangman.model.dictionary.HangmanDictionary;

public class ScoreFactoryServices extends AbstractModule {

    private final HangmanDictionary dictionary;

    public ScoreFactoryServices(HangmanDictionary dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    protected void configure() {
        bind(GameScore.class).to(PowerScore.class);
    }

    @Provides
    public HangmanDictionary provideDictionary() {
        return dictionary;
    }
}
