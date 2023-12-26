package loops;

public class pattern1 {
    public static void main(String args[]) {
        int h = 3, w = 6, i, j;
        for (i = 1; i <= h; i++) {
            for (j = 1; j <= w; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
