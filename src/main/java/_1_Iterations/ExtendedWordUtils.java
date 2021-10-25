package _1_Iterations;

public class ExtendedWordUtils extends WordUtils {

    @Override
    public String modifyWords(String firsWord, String secondWord, String thirdWord) {
        return super.modifyWords(firsWord, secondWord, thirdWord).toUpperCase();
    }
}
