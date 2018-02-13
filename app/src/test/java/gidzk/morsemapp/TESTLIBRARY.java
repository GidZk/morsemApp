package gidzk.morsemapp;

import java.util.HashMap;

import gidzk.morsemapp.ENGINE.LanguageExtension;

/**
 * Created by John on 2018-01-27.
 */

public class TESTLIBRARY implements LanguageExtension {


    @Override
    public String languageName() {
        return "untzTestuntz";
    }

    @Override
    public HashMap<Character, String> initAlphabet_decrpyt() {

        HashMap <Character ,String> fagget = new HashMap();

        fagget.put('a',"JEEEZUS");


        return fagget;
    }

    @Override
    public HashMap<String, Character> initAlphabet_encrpyt() {
        return null;
    }
}




