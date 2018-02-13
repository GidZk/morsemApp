package gidzk.morsemapp;

import org.junit.Test;

import java.util.Collection;

import gidzk.morsemapp.ENGINE.LanguageExtension;
import gidzk.morsemapp.Libs.Library_English;
import gidzk.morsemapp.ENGINE.Translator;
import gidzk.morsemapp.ENGINE.LanguageParser;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void parseIsOk() throws Exception{

        Translator handler =  LanguageParser.getInstance();
        Collection oldParse = handler.encryptParse("OLDPARSE");
        //System.out.println(oldParse);


        Collection<String> wospwaces =  handler.decryptParse_raw("abc");
        Collection<String> wSpaces  =  handler.decryptParse_raw("Abc B C");
        Collection<String> specials = handler.decryptParse_raw(". , : ? ' - / "+ (char) (34) + " @ =");


       System.out.println( "without spaces " +  (wospwaces));
        System.out.println(" with spaces " + (wSpaces));
        System.out.println("ALPHABET" + "        A B C D E F G H I J K L M N O P Q R S T U V X Y Z ");
        System.out.println("Special characters: " + specials);


    }

    /**
     * tests that lang handler with and without arguments give  the same output
     */
    @Test
    public void testLangHandler_argument_WRITTEN_1(){
        LanguageExtension library_english = new Library_English();

        String notParsed = "Abc B C";

        Translator handler =  LanguageParser.getInstance();



        Collection<String> wospwaces =  handler.decryptParse_raw("abc");
        Collection<String> wSpaces  =  handler.decryptParse_raw("Abc B C");
        Collection<String> specials = handler.decryptParse_raw(". , : ? ' - / "+ (char) (34) + " @ =");


        System.out.println( "without spaces " +  (wospwaces));
        System.out.println(" with spaces " + (wSpaces));
        System.out.println("ALPHABET" + "        A B C D E F G H I J K L M N O P Q R S T U V X Y Z ");
        System.out.println("Special characters: " + specials);

        handler.changeLanguage(new Library_English(),'!');

        wospwaces =  handler.decryptParse_raw("abc");
        wSpaces  =  handler.decryptParse_raw("Abc B C");
        specials = handler.decryptParse_raw(". , : ? ' - / "+ (char) (34) + " @ =");


        System.out.println( "without spaces " +  (wospwaces));
        System.out.println(" with spaces " + (wSpaces));
        System.out.println("ALPHABET" + "        A B C D E F G H I J K L M N O P Q R S T U V X Y Z ");
        System.out.println("Special characters: " + specials);






    }


    @Test
    public void testCharConverterDifferentType(){



    }






    //todo TEST FAILED, need to find a way to make map immutable
    @Test
    public  void testUnmodifiableMap(){



    }






}



