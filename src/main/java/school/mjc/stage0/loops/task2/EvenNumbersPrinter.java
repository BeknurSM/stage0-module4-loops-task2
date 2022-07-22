package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int count = 2;
        if (printTillInclusive == 0){
            System.out.print("");
        }
        else
        {
        while (count <= printTillInclusive) {
            System.out.println(count);
            count = count + 2;
        }
        }
    }
}
