package gidzk.morsemapp.ENGINE;

import java.util.ArrayList;
import java.util.List;

public class LanguageHandler {
    CharConverter converter;

    public LanguageHandler(CharConverter converter){
        this.converter = converter;

    }
    public LanguageHandler(){
        this.converter = new CHARCONVERTER_INTERNATIONAL();

    }

    /**
     *
     * @param input
     *  requirements : non null String
     *               : specified string from current domain alphabet
     *
     *
     * @return a List of Strings in current language
     * ensures :
     */
    public List<String> parse (String input){

        List <String>         outer = new ArrayList<>();
        StringBuilder builder       = new StringBuilder();
        String inner;

        for (Character c : input.toLowerCase().toCharArray()){

            if (c != ' '){
                builder.append(converter.encrypt(c)).append("|");

            }else {
                inner = builder.toString();
                 outer.add(inner);
                // clears the current stringBuilder.
                builder.setLength(0);

            }
        }
        inner = builder.toString();
        outer.add(inner);

    return outer;
    }

    // not really done yet
    public ArrayList<String> encryptParse(String input){
        List<String> trg = new ArrayList<>();

        for (Character c :input.toLowerCase().toCharArray()){
            trg.add(converter.encrypt(c));
        }

        return null;

    }

    
}
