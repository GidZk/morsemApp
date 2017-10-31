package gidzk.morsemapp.ENGINE;


import java.util.ArrayList;
import java.util.HashMap;


abstract class SuperMommaCharConverter implements CharConverter {


    ArrayList<Character> alphabet;
    ArrayList<String> morseAlphabet;
    ArrayList<Character>INVALID_CHARS;
    private HashMap<Character, String> toMorseMap;
    private HashMap<String , Character> toCharMap;

    SuperMommaCharConverter(){
        alphabet        = new ArrayList<>();
        morseAlphabet   = new ArrayList<>();
        INVALID_CHARS   = new ArrayList<>();
        toMorseMap      = new HashMap<>();
        toCharMap       = new HashMap<>();


        addAlphabet();
        addNumerics();
        addInvalids();

        if (alphabet.size() == morseAlphabet.size()){
            initCharMap();
            initMorseMap();

        }else {
            throw new IllegalArgumentException ("Arrays needs to be the same size");

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




}
