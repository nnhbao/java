import java.util.*;

public class warmup_xo {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = 3;
        int[][] a = new int[n][n];
        int count1 = 0;
        int count0 = 0;
        int currentplr = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                do {
                    a[i][j] = rd.nextInt(0,2);
                    if (a[i][j] == 1) {
                        currentplr = 1;
                    } else {
                        currentplr = 0;
                    }
                } while (a[i][j] != currentplr);
                
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i][0] == 1) {
                count1++;
            } else {
                count0++;

            }
        if (count1 == 3) {
                System.out.println("Player 1 wins");
                return;
            } else if (count0 == 3) {
                System.out.println("Player 0 wins");
                return;
            }
        count1 = 0;
        count0 = 0;


        }
    }
}
