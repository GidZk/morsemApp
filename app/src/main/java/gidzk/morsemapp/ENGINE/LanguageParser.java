package gidzk.morsemapp.ENGINE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import gidzk.morsemapp.Libs.Library_English;

public class LanguageParser implements Translator {
    private CharConverter converter;
    private  char letterSeparator;
    private static LanguageParser instance;

    //TODO add  (adress of some sort) constructor to be able to fetch code from some database

    public static Translator  getInstance() {

        if (instance == null) {
            instance = new LanguageParser();
        }
            return  instance;
    }


    public void changeLanguage(LanguageExtension library, Character letterSeparator ) {
        this.converter.changeLanguage(library);
        this.letterSeparator = letterSeparator;
    }


    private LanguageParser(){
        this.converter = new SuperMommaCharConverter(new Library_English());
        this.letterSeparator = '|';
    }


    @Override
    public Collection<String> decryptParse(String input) {




        return null;
    }

    /**
     *
     * @param input
     *  requirements : non null String
     *               : specified string from current domain alphabet
     *
     *
     * @return a List of strings, to be
     * ensures :
     */
    // TODO Rework in order to be able to use generocs, one way might be to implement it with ->
    // TODO     -> a generic list, could be done if the space were put in some genericclass, and initilized in the charconverter
    //
    public Collection<String> decryptParse_raw(String input){

        List <String>         outer = new ArrayList<>();
        StringBuilder builder       = new StringBuilder();
        String inner;

        for (Character c : input.toLowerCase().toCharArray()){

            if (c != ' '){
                builder.append(converter.decrypt(c)).append(letterSeparator);

            }else {
                inner = builder.toString();
                 outer.add(inner);
                // clears the current stringBuilder.
                builder.setLength(0);

            }
        }
        inner = builder.toString();
        outer.add(inner);

    return outer;
    }




    // todo : implement this method
    public Collection<String> encryptParse(String input){

        return null;

    }

    
}
