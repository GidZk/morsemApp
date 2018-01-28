package gidzk.morsemapp;

import gidzk.morsemapp.ENGINE.CharConverter;
import gidzk.morsemapp.ENGINE.SuperMommaCharConverter;

/**
 * Created by John on 2018-01-27.
 */

public class TESTLIBRARY extends SuperMommaCharConverter {


    TESTLIBRARY() {
        super();
    }

    @Override
    protected void addNumerics() {



    }

    @Override
    public void addSymbols() {

        toDecryptMap.put('a',"This testing string is pwetty cool");


    }

    @Override
    protected void addAlphabet() {

    }

    }




