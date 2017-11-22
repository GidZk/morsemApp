package gidzk.morsemapp.ENGINE;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * if a class extends this class, the constructor method has to be created, see template pattern
 *
 * abstract methods :
 *
 * addAlphabet : add the desired alphabet to your alphabet and morseAlphabet.
    add them in order to make it work, eg: alphabet.get(i) corresponds to morsealphabet.get(i).
    so if you want to add an 'a':          alphabet.add('a')
                                            moreseAlphabet.add("whatever you like")
 *
 * addInvalids : add the invalid signs you want to ignore in the parsing. the invalid characters
 * will be put at the index right after the last entry of numerics. Easypeasy!
 *
 * example: the last entry of the numerics is at index i
 *                  then the first entry of invalids will be at index i+1 to size-1
 *
 * the first indexes can be reach via notValidIndex and numericIndex
 *
 * eg of the standard Library
 * [a..z,0..9,^{not valid characters},%^]
 *
 */

abstract class SuperMommaCharConverter implements CharConverter {


    ArrayList<Character> alphabet;
    ArrayList<String> morseAlphabet;
    ArrayList<Character>INVALID_CHARS;
    private HashMap<Character, String> toMorseMap;
    private HashMap<String , Character> toCharMap;
    private final int notValidIndex;
    private final int validCharacterIndex;
    private final int numericIndex;

    SuperMommaCharConverter() {
        alphabet = new ArrayList<>();
        morseAlphabet = new ArrayList<>();
        INVALID_CHARS = new ArrayList<>();
        toMorseMap = new HashMap<>();
        toCharMap = new HashMap<>();

        addAlphabet();
        if (alphabet.size() == morseAlphabet.size()) {
            numericIndex = alphabet.size();
        }else throw new IllegalArgumentException("mismatching Array sizes, morsealphabet and alphabet should be the same");

        addNumerics();
        if (alphabet.size() == morseAlphabet.size()){
        validCharacterIndex = alphabet.size();
        }else throw new IllegalArgumentException("mismatching Array sizes, morsealphabet and alphabet should be the same");

        addValids();
        if (alphabet.size() == morseAlphabet.size()){
        notValidIndex = alphabet.size();
        }else throw new IllegalArgumentException("mismatching Array sizes, morsealphabet and alphabet should be the same arrayLength");
        addInvalids();

        if (alphabet.size() == morseAlphabet.size()){
            initCharMap();
            initMorseMap();

        }else {
            throw new IllegalArgumentException ("alphabet arrays needs to be the same size");

        }
    }

    @Override
    public String encrypt(Character ch) {
        return toMorseMap.get(ch);
    }
    @Override
    public Character decrypt(String str) {
        return toCharMap.get(str);
    }
    //---------------- CONSTRUCTOR METHODS-------------------



    private void addNumerics(){

        alphabet.add('0');
        morseAlphabet.add("-----");

        alphabet.add('1');
        morseAlphabet.add(".----");

        alphabet.add('2');
        morseAlphabet.add("..---");

        alphabet.add('3');
        morseAlphabet.add("...--");

        alphabet.add('4');
        morseAlphabet.add("....-");

        alphabet.add('5');
        morseAlphabet.add(".....");

        alphabet.add('6');
        morseAlphabet.add("-....");

        alphabet.add('7');
        morseAlphabet.add("--...");

        alphabet.add('8');
        morseAlphabet.add("---..");

        alphabet.add('9');
        morseAlphabet.add("----.");





    }


    abstract void addValids();

    abstract void addAlphabet();

    abstract void addInvalids();

    private void initMorseMap(){
        for (int i = 0 ; i < morseAlphabet.size(); i ++ ){
            toCharMap.put(morseAlphabet.get(i),alphabet.get(i));

        }

    }


    /**
     * CONSTRUCTOR METHOD,
     *
     *      -first adds entire alphabet with <Char,String> values to Hashmap toMorseMap
     *      - then adds the not allowed characters and substitutes with the empty string
     *
     */
    private void  initCharMap(){
        for(int i = 0; i<alphabet.size() ; i++){
            toMorseMap.put(alphabet.get(i),morseAlphabet.get(i));

        }

        for(int i = 0; i<INVALID_CHARS.size(); i++){
            toMorseMap.put(INVALID_CHARS.get(i),"");
        }






    }


    public int getNumericIndex() {
        return numericIndex;
    }


    public int getNotValidIndex() {
        return notValidIndex;
    }




}
