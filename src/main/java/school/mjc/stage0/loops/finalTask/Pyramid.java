package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        // outer loop to handle number of rows
        for (int i = 0; i < cathetusLength; i++) {

            // inner loop to handle number spaces
            for (int j = cathetusLength - i; j > 1; j--) {
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}