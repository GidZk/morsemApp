package gidzk.morsemapp.ENGINE;


interface CharConverter {

    String decrypt(Character ch);
    char encrypt(String str);

    void changeLanguage(LanguageExtension library);

}
