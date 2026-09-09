import java.util.*;

public class CS211_Bai19 {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = 3;
        int[][] a = new int[n][n];
        int count1 = 0;
        int count0 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    a[i][j] = rd.nextInt(0,2);
                }
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    count1++;
                } else {
                    count0++;
                }
            }
            if (count1 == n) {
                System.out.println("Player 1 wins");
                break;
            } else if (count0 == n) {
                System.out.println("Player 0 wins");
                break;
            } else {
                count1 = 0;
                count0 = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j][i] == 1) {
                    count1++;
                } else {
                    count0++;
                }
            }
            if (count1 == n) {
                System.out.println("Player 1 wins");
                break;
            } else if (count0 == n) {
                System.out.println("Player 0 wins");
                break;
            } else {
                count1 = 0;
                count0 = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i][i] == 1) {
                count1++;
            } else {
                count0++;
            }
        }
        if (count1 == n) {
            System.out.println("Player 1 wins");
        } else if (count0 == n) {
            System.out.println("Player 0 wins");
        }
        for (int i = 2; i >= 0; i--) {
            if (a[i][n - 1 - i] == 1) {
                count1++;
            } else {
                count0++;
            }
        }
        if (count1 == n) {
            System.out.println("Player 1 wins");
        } else if (count0 == n) {
            System.out.println("Player 0 wins");
        }
    }
}