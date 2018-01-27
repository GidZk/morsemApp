package gidzk.morsemapp.ENGINE;


import java.util.Collections;
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

public abstract class SuperMommaCharConverter implements CharConverter {


    protected HashMap<String, Character> toEncryptMap;
    protected HashMap<Character, String> toDecryptMap;

    //todo : either make the maps immutable, by making the instancevariable immutable maps and let ->
    // todo: -> instanice happen, and the reutrning a immutablemap.
    protected SuperMommaCharConverter() {
        toEncryptMap = new HashMap<>();
        toDecryptMap = new HashMap<>();

        addAlphabet();
        addNumerics();
        addSymbols();

        Collections.unmodifiableMap(toDecryptMap);
        Collections.unmodifiableMap(toEncryptMap);

    }

    @Override
    public String decrypt(Character ch) {
        return toDecryptMap.get(ch);
    }

    @Override
    public char encrypt(String str) {
        return toEncryptMap.get(str);
    }
    //---------------- CONSTRUCTOR METHODS-------------------

    protected abstract void addNumerics();

    protected abstract void addSymbols();

    protected abstract void addAlphabet();


    public HashMap getMap() {

        return toDecryptMap;


    }


}



