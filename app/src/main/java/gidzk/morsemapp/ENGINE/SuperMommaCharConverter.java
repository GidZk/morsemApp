package gidzk.morsemapp.ENGINE;


import java.util.ArrayList;
import java.util.HashMap;

abstract class SuperMommaCharConverter implements CharConverter {
    ArrayList<Character> alphabet;
    ArrayList<String> morseAlphabet;
    private HashMap<Character, String> toMorseMap;
    private HashMap<String , Character> toCharMap;

    SuperMommaCharConverter(){
        addAlphabet();

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

    abstract void addAlphabet();

    private void initMorseMap(){
        for (int i = 0 ; i < morseAlphabet.size(); i ++ ){
            toCharMap.put(morseAlphabet.get(i),alphabet.get(i));

        }

    }

    private void  initCharMap(){

        for(int i = 0; i<alphabet.size() ; i++){
            toMorseMap.put(alphabet.get(i),morseAlphabet.get(i));

        }

    }


}
