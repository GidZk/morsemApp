package gidzk.morsemapp.ENGINE;


 public class CHARCONVERTER_INTERNATIONAL extends SuperMommaCharConverter  {


     public CHARCONVERTER_INTERNATIONAL() {
    super();

    }

     @Override
     public void addSymbols() {


         toDecryptMap.put('.',".-.-.-");

         toDecryptMap.put(',',"--..--");

         toDecryptMap.put(':',"---...");

         toDecryptMap.put('?',"..--..");

         //aphostrofe '
         toDecryptMap.put((char)(39),".----.");

         toDecryptMap.put((char)(45),"-....-");

         toDecryptMap.put((char)(47),"-..-.");

         toDecryptMap.put('"',".-..-.");

         toDecryptMap.put('@',".--.-.");

         toDecryptMap.put('=',"-...-");





     }

     @Override
    protected void addAlphabet(){


         toDecryptMap.put('a',".-");

         toDecryptMap.put('b',"-...");

         toDecryptMap.put('c',"-.-.");

         toDecryptMap.put('d',"-..");

         toDecryptMap.put('e',".");

         toDecryptMap.put('f',"..-.");

         toDecryptMap.put('g',"--.");

         toDecryptMap.put('h',"....");

         toDecryptMap.put('i',"..");

         toDecryptMap.put('j',".---");

         toDecryptMap.put('k',"-.-");

         toDecryptMap.put('l',".-..");

         toDecryptMap.put('m',"--");

         toDecryptMap.put('n',"-.");

         toDecryptMap.put('o',"---");

         toDecryptMap.put('p',".--.");

         toDecryptMap.put('q',"--.-");

         toDecryptMap.put('r',".-.");

         toDecryptMap.put('s',"...");

         toDecryptMap.put('t',"-");

         toDecryptMap.put('u',"..-");

         toDecryptMap.put('v',"...-");

         toDecryptMap.put('w',".--");

         toDecryptMap.put('x',"-..-");

         toDecryptMap.put('y',"-.--");

         toDecryptMap.put('z',"--..");


    }

    @Override
     protected  void addNumerics(){

        toDecryptMap.put('0',"-----");

        toDecryptMap.put('1',".----");

        toDecryptMap.put('2',"..---");

        toDecryptMap.put('3',"...--");

        toDecryptMap.put('4',"....-");

        toDecryptMap.put('5',".....");

        toDecryptMap.put('6',"-....");

        toDecryptMap.put('7',"--...");

        toDecryptMap.put('8',"---..");

        toDecryptMap.put('9',"----.");


     }














 }
