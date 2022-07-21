package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        int result = 0;
        while (count != multiplyByAndToInclusive) {
            result = count * result;
            count++;
            System.out.println(result);
        }
    }
}
