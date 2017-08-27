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


        List<List<String>> woSpaces = (List<List<String>>) handler.parse("IHATESPACES");
        List<List<String>> wSpaces  = (List<List<String>>) handler.parse("I HATE SPACES");


        System.out.println( "without spaces " +  (woSpaces));
        System.out.println(" with spaces " + (wSpaces));






    }




}