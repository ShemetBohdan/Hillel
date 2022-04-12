package lesson4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NextTask {

    public static void main(String[] args) {

        String[] word1  = {"Have","a","nice","day" };
        String[] word2  = {"Ha","ve","a","ni","ce","da","y"};
        String array1 = Arrays.stream(word1).collect(Collectors.joining());
        String array2 = Arrays.stream(word2).collect(Collectors.joining());
        if (array1.equals(array2)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
