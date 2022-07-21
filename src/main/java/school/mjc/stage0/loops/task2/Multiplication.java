package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int result;
        if (multiplyByAndToInclusive == 0)
        {
            System.out.print("");
        }
        else{
            if (0>multiplyByAndToInclusive)
            {
                int count = 0;
                while (count != multiplyByAndToInclusive-1)
                {
                    result = count * multiplyByAndToInclusive*(-1);
                    count--;
                    System.out.println(result);

                }
            }
            else
            {
                int count = 0;
                while (count != multiplyByAndToInclusive+1)
                {
                    result = count * multiplyByAndToInclusive;
                    count++;
                    System.out.println(result);
                }
            }
        }
    }
}
