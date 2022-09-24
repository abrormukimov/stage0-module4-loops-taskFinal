package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int xCount = 1;
        for (int y = cathetusLength; y >= 1; y--) {
            for (int x = cathetusLength; x >= 1; x--) {
                if (x <= xCount) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            xCount++;
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}