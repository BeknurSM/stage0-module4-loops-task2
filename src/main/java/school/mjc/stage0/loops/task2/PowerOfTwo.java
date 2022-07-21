package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        double result = 1;
        int count = 0;
        String word = "";
        if (power<0){
            System.out.println("too much power");
        }
        else {
            while(count != power+1) {
                result = Math.pow(2, count);
                word = String.valueOf((int)result);
                System.out.println(word);
                count++;
            }
        }
    }
}
