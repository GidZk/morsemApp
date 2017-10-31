package gidzk.morsemapp.ENGINE;


public interface CharConverter {

    String encrypt(Character ch);
    Character decrypt(String str);

}
