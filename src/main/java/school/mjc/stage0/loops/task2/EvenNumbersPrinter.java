package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int count = 0;
        if (printTillInclusive == 0){
            System.out.print("");
        }
        else
        {
        while (count != printTillInclusive) {
            count = count + 2;
            System.out.println(count);
        }
        }
    }
}
