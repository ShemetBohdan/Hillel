package lesson3;

public class Reserve {

    public static void main(String[] args) {

        String sentense = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        String replacedString = sentense.replace("Z", " ");
        String[] words = new StringBuilder(replacedString).reverse().toString().split(" ");
        StringBuilder newStr = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)
            newStr.append(words[i]).append(" ");
        System.out.println(newStr);
    }
}
