package gidzk.morsemapp;

import org.junit.Test;

import gidzk.morsemapp.ENGINE.MorseHandler;

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

        MorseHandler handler = new MorseHandler();


        System.out.println(handler.parse("ABCDEFGHIJKLMNPQRSTUVXYZ"));



    }




}