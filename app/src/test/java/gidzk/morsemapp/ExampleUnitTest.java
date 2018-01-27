package gidzk.morsemapp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import gidzk.morsemapp.ENGINE.CharConverter;
import gidzk.morsemapp.ENGINE.LanguageHandler;

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

        LanguageHandler handler = new LanguageHandler();
        ArrayList oldParse = handler.encryptParse("OLDPARSE");
        //System.out.println(oldParse);


        List<String> wospwaces =  handler.parse("abc");
        List<String> wSpaces  =  handler.parse("Abc B C");
        List<String> specials = handler.parse(". , : ? ' - / "+ (char) (34) + " @ =");


       System.out.println( "without spaces " +  (wospwaces));
        System.out.println(" with spaces " + (wSpaces));
        System.out.println("ALPHABET" + "        A B C D E F G H I J K L M N O P Q R S T U V X Y Z ");
        System.out.println("Special characters: " + specials);

        System.out.println();

    }

    @Test
    public void testCharConverter(){


        CharConverter c = new TESTLIBRARY();



        System.out.println(c.decrypt("k"));


    }





}



