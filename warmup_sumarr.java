import java.util.*;

public class warmup_sumarr {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(2,10+1);
        int[][] a = new int[n][n];
        int s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rd.nextInt(10,100+1);
            }
        }
        for (int i = 0; i < n; i++) {
            s += a[i][i];
        }
        for (int i = 0; i < n; i++) {
            for (int p = 0; p < n; p++) {
                System.out.print(a[i][p] + "  ");
            }
            System.out.println();
        }
        System.out.println("Sum: " + s);
    }
}
