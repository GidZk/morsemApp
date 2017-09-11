package gidzk.morsemapp.ENGINE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageHandler {
    CharConverter converter;

    public LanguageHandler(CharConverter converter){
        this.converter = converter;

    }
    public LanguageHandler(){
        this.converter = new CHARCONVERTER_ENGLISH();

    }
    
    // seems to be working, write some more tests to make sure.
    public List<List<String>> parse (String input){

        List <List <String>> outer = new ArrayList<>();
        List<String>         inner = new ArrayList<>();


        for (Character c : input.toLowerCase().toCharArray()){

            if (c != ' '){
                inner.add(converter.encrypt(c));

            }else {
                outer.add(inner);
                inner.clear();
            }

        }

        outer.add(inner);

    return outer;

    }


    // dont use ,does not function with spaces
    public ArrayList<List<String>> encryptParse(String input){
        List<String> trg = new ArrayList<>();

        for (Character c :input.toLowerCase().toCharArray()){
            trg.add(converter.encrypt(c));
        }

        return new ArrayList<>(Arrays.asList(trg));

    }

    
}
