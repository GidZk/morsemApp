package gidzk.morsemapp.ENGINE;


 public class CHARCONVERTER_INTERNATIONAL extends SuperMommaCharConverter {

     /**
      *skipping () brackets, morsecode dont have both of them and I want to skip ambiguty
      *
      *
      */











     CHARCONVERTER_INTERNATIONAL() {
    super();

    }

     @Override
     void addValids() {

        alphabet.add('.');
        morseAlphabet.add(".-.-.-");

        alphabet.add(',');
        morseAlphabet.add("--..--");
        // questionmarl '?'

         alphabet.add(':');
         morseAlphabet.add("---...");

        alphabet.add('?');
        morseAlphabet.add("..--..");

        //aphostrofe '
        alphabet.add((char)(39));
        morseAlphabet.add(".----.");

        //Hyphen   "-"
        alphabet.add((char)(45));
        morseAlphabet.add("-....-");

        //  slash '/'
         alphabet.add((char)(47));
        morseAlphabet.add("-..-.");


        //skipping brackets : reason ambiguity backwards

       // alphabet.add('(');
       // morseAlphabet.add("-.--.-");

       // alphabet.add(')');
       // morseAlphabet.add("-.--.-");

        alphabet.add('"');
        morseAlphabet.add(".-..-.");

        alphabet.add('@');
        morseAlphabet.add(".--.-.");

        alphabet.add('=');
        morseAlphabet.add("-...-");








     }

     @Override
    protected void addAlphabet(){

        alphabet.add('a');
         morseAlphabet.add(".-");

        alphabet.add('b');
        morseAlphabet.add("-...");

        alphabet.add('c');
        morseAlphabet.add("-.-.");

        alphabet.add('d');
        morseAlphabet.add("-..");

        alphabet.add('e');
        morseAlphabet.add(".");

        alphabet.add('f');
        morseAlphabet.add("..-.");

        alphabet.add('g');
        morseAlphabet.add("--.");

        alphabet.add('h');
        morseAlphabet.add("....");

        alphabet.add('i');
        morseAlphabet.add("..");

        alphabet.add('j');
        morseAlphabet.add(".---");

        alphabet.add('k');
        morseAlphabet.add("-.-");

        alphabet.add('l');
        morseAlphabet.add(".-..");

        alphabet.add('m');
        morseAlphabet.add("--");

        alphabet.add('n');
        morseAlphabet.add("-.");

        alphabet.add('o');
        morseAlphabet.add("---");

        alphabet.add('p');
        morseAlphabet.add(".--.");

        alphabet.add('q');
        morseAlphabet.add("--.-");

        alphabet.add('r');
        morseAlphabet.add(".-.");

        alphabet.add('s');
        morseAlphabet.add("...");

        alphabet.add('t');
        morseAlphabet.add("-");

        alphabet.add('u');
        morseAlphabet.add("..-");

        alphabet.add('v');
        morseAlphabet.add("...-");

        alphabet.add('w');
        morseAlphabet.add(".--");

        alphabet.add('x');
        morseAlphabet.add("-..-");

        alphabet.add('y');
        morseAlphabet.add("-.--");

        alphabet.add('z');
        morseAlphabet.add("--..");

    }


    //TODO find regex s.t all my invalid characters will be added.
     @Override
     void addInvalids() {

         INVALID_CHARS.add('#');
         INVALID_CHARS.add('$');
     }



 }
