package gidzk.morsemapp.ENGINE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MorseHandler {
    CharConverter converter;

    public MorseHandler(){

        // TODO: FIGURE OUT A WAY TO DECIDE HOW THE CONVERTER LANGUAGES SHOULD BE DECIDED.


    }


    public ArrayList<List<String>> parse(String input){
        List<String> trg = new ArrayList<>();

        for (Character c :input.toLowerCase().toCharArray()){
            trg.add(converter.encrypt(c));
        }
        return new ArrayList<>(Arrays.asList(trg));

    }






}
