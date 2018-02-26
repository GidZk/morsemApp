package gidzk.morsemapp.ENGINE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by John on 2018-01-27.
 */

public interface Translator {

    String appendTo(Character input);

    String decryptParse(String input);

    Collection<String> decryptParse_raw(String input);

    Collection<String> encryptParse(String input);

    void changeLanguage(LanguageExtension library, Character letterSeparator );

}


