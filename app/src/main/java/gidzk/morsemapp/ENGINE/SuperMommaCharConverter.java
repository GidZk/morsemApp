package gidzk.morsemapp.ENGINE;


import java.util.Collections;
import java.util.HashMap;



 class SuperMommaCharConverter implements CharConverter {


    private HashMap<String, Character> toEncryptMap;
    private HashMap<Character, String> toDecryptMap;
    private LanguageExtension library;

    //todo : either make the maps immutable, by making the instancevariable immutable maps and let ->
    // todo: -> instanice happen, and the reutrning a immutablemap.
    protected SuperMommaCharConverter(LanguageExtension library)  {
        toDecryptMap = library.initAlphabet_decrpyt();
        toEncryptMap = library.initAlphabet_encrpyt();
        this.library = library;

    }

    @Override
    public String decrypt(Character ch) {
        return toDecryptMap.get(ch);
    }

    @Override
    public char encrypt(String str) {
        return toEncryptMap.get(str);
    }

     @Override
     public void changeLanguage(LanguageExtension library) {
         this.library = library;
     }



     public HashMap getMap() {
        return toDecryptMap;

    }



    }





