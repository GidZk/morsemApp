package gidzk.morsemapp.ENGINE;

import java.util.Collection;
import java.util.HashMap;

public interface LanguageExtension {

    /**
     *
     * @return name of the language that will appear in dropdownList in apps frontEnd
     */
    String languageName();
    /**

     * @return assign the characters you want to use, and map them to your String.
     */
    HashMap<Character, String> initAlphabet_decrpyt();
    HashMap<String, Character> initAlphabet_encrpyt();



}
