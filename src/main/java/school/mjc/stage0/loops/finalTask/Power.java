package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int summ = numberToPrint;
        for (int i = 1; i < power; i++) {
            summ *= numberToPrint;
        }
        System.out.println(summ);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}