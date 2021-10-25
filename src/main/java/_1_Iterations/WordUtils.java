package _1_Iterations;

public class WordUtils {

    public final static String Default_word = "Eryk jest fajny";

    public static int CountLetters (String a){
        return a.length();
    }

    public String modifyWords(String firsWord){
        return firsWord;
    }
    public String modifyWords(String firsWord, String secondWord){
        return firsWord + " " + secondWord;
    }
    protected String modifyWords(String firsWord, String secondWord, String thirdWord){
        return firsWord + " " + secondWord + " " + thirdWord;
    }
}
