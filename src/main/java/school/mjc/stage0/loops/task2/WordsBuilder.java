package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int count = 0;
        String word = "";
        while (count != chars.length){
            word = word + String.valueOf(chars[count]);
            count++;
        }
        System.out.print(word);

    }
}
