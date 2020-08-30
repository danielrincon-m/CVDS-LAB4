/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

import com.google.inject.AbstractModule;
import hangman.model.English;
import hangman.model.Language;
import hangman.model.dictionary.EnglishDictionaryDataSource;
import hangman.model.dictionary.HangmanDictionary;
import hangman.view.HangmanPanel;
import hangman.view.HangmanStickmanPanel;

/**
 *
 * @author 2106913
 */

public class HangmanFactoryServices extends AbstractModule {

    @Override
    protected void configure() {
        /* Guice dependency injection */
        // bind(Interface.class).to(Concrete.class);
        bind(Language.class).to(English.class);
        bind(HangmanDictionary.class).to(EnglishDictionaryDataSource.class);
        bind(HangmanPanel.class).to(HangmanStickmanPanel.class);
    }

}
