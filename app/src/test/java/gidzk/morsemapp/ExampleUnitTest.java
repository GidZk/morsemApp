package gidzk.morsemapp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


        List<String> woSpaces =  handler.parse("ABCD");
        List<String> wSpaces  =  handler.parse("A B C D");


       System.out.println( "without spaces " +  (woSpaces));
        System.out.println(" with spaces " + (wSpaces));






    }




}