package gidzk.morsemapp.Libs;


import java.util.HashMap;

import gidzk.morsemapp.ENGINE.LanguageExtension;

/**
 * example class of a library
 */


public class Library_English implements LanguageExtension {


    @Override
    public String languageName() {
        return "English";
    }

    @Override
    public HashMap<Character, String> initAlphabet_decrpyt() {


         HashMap<Character,String> toDecryptMap = new HashMap<>();


        // alphabet
        toDecryptMap.put('a',".-");
        toDecryptMap.put('b',"-...");
        toDecryptMap.put('c',"-.-.");
        toDecryptMap.put('d',"-..");
        toDecryptMap.put('e',".");
        toDecryptMap.put('f',"..-.");
        toDecryptMap.put('g',"--.");
        toDecryptMap.put('h',"....");
        toDecryptMap.put('i',"..");
        toDecryptMap.put('j',".---");
        toDecryptMap.put('k',"-.-");
        toDecryptMap.put('l',".-..");
        toDecryptMap.put('m',"--");
        toDecryptMap.put('n',"-.");
        toDecryptMap.put('o',"---");
        toDecryptMap.put('p',".--.");
        toDecryptMap.put('q',"--.-");
        toDecryptMap.put('r',".-.");
        toDecryptMap.put('s',"...");
        toDecryptMap.put('t',"-");
        toDecryptMap.put('u',"..-");
        toDecryptMap.put('v',"...-");
        toDecryptMap.put('w',".--");
        toDecryptMap.put('x',"-..-");
        toDecryptMap.put('y',"-.--");
        toDecryptMap.put('z',"--..");




        // numerics
        toDecryptMap.put('0',"-----");
        toDecryptMap.put('1',".----");
        toDecryptMap.put('2',"..---");
        toDecryptMap.put('3',"...--");
        toDecryptMap.put('4',"....-");
        toDecryptMap.put('5',".....");
        toDecryptMap.put('6',"-....");
        toDecryptMap.put('7',"--...");
        toDecryptMap.put('8',"---..");
        toDecryptMap.put('9',"----.");




        // symbols
        toDecryptMap.put('.',".-.-.-");
        toDecryptMap.put(',',"--..--");
        toDecryptMap.put(':',"---...");
        toDecryptMap.put('?',"..--..");
        //aphostrofe '
        toDecryptMap.put((char)(39),".----.");
        toDecryptMap.put((char)(45),"-....-");
        toDecryptMap.put((char)(47),"-..-.");
        toDecryptMap.put('"',".-..-.");
        toDecryptMap.put('@',".--.-.");
        toDecryptMap.put('=',"-...-");

        return toDecryptMap;

    }


    private HashMap<Character, String> initAlpha_decrpyt(HashMap<Character,String> toDecryptMap) {



        return toDecryptMap;



    }



    @Override
    public HashMap<String, Character> initAlphabet_encrpyt() {
        return null;
    }





    private HashMap<String, Character> addNumerics_encrypt() {
        return null;
    }






    private HashMap<String, Character> addSymbols_toencrypt() {
        return null;
    }
}
