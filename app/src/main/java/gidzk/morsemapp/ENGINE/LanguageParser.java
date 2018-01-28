package gidzk.morsemapp.ENGINE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import gidzk.morsemapp.Libs.Library_English;

public class LanguageParser implements Translator {
    CharConverter converter;

    //TODO add  (adress of some sort) constructor to be able to fetch code from some database
    //TODO add

    public LanguageParser(){
        this.converter = new SuperMommaCharConverter(new Library_English());

    }

    public LanguageParser(LanguageExtension library){

        this.converter = new SuperMommaCharConverter(library);

    }

    /**
     *
     * @param input
     *  requirements : non null String
     *               : specified string from current domain alphabet
     *
     *
     * @return a List of Strings in current language
     * ensures :
     */
    // TODO Rework in order to be able to use generocs, one way might be to implement it with ->
    // TODO     -> a generic list, could be done if the space were put in some genericclass, and initilized in the charconverter
    //
    public Collection<String> decryptParse(String input){

        List <String>         outer = new ArrayList<>();
        StringBuilder builder       = new StringBuilder();
        String inner;

        for (Character c : input.toLowerCase().toCharArray()){

            if (c != ' '){
                builder.append(converter.decrypt(c)).append("|");

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
