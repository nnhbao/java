import java.util.*;

public class warmup_xo {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] arr = new int[3][3];
        int a, b;
        int player = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = -1;
            }
        }    
        do {
            count = 0;
            a = rd.nextInt(0,3);
            b = rd.nextInt(0,3);
            if (arr[a][b] == -1) {
                arr[a][b] = rd.nextInt(0,2);
                if (player == 0) {
                    arr[a][b] = 1;
                    player = 1;
                } else if (player == 1) {
                    arr[a][b] = 0;
                    player = 0;
                }
            }
            player = arr[a][b];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i][j] == -1) {
                        count++;
                    }
                }
            }
            check(arr);
        } while (count > 0);
        System.out.println("Draw");
        print(arr);
    }
    public static void check(int[][] arr) {
        int countrow0 = 0;
        int countrow1 = 0;
        int countcol0 = 0;
        int countcol1 = 0;
        int countdiag0 = 0;
        int countdiag1 = 0;
        int countdiaginvert0 = 0;
        int countdiaginvert1 = 0;
        for (int i = 0; i < arr.length; i++) {
            countrow0 = 0;
            countrow1 = 0;
            countcol0 = 0;
            countcol1 = 0;
            countdiag0 = 0;
            countdiag1 = 0;
            countdiaginvert0 = 0;
            countdiaginvert1 = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    countrow0++;
                } else if (arr[i][j] == 1) {
                    countrow1++;
                }
                if (arr[j][i] == 0) {
                    countcol0++;
                } else if (arr[j][i] == 1) {
                    countcol1++;
                }
                if (arr[j][j] == 0) {
                countdiag0++;
                } else if (arr[j][j] == 1) {
                    countdiag1++;
                }
                if (arr[j][3-1-j] == 0) {
                    countdiaginvert0++;
                } else if (arr[j][3-1-j] == 1) {
                    countdiaginvert1++;
                }
            }
            
            if (countrow0 == 3 || countcol0 == 3 || countdiag0 == 3 || countdiaginvert0 ==3) {
                System.out.println("Player 0 wins");
                print(arr);
                System.exit(0);
            } else if (countrow1 == 3 || countcol1 == 3 || countdiag1 == 3 || countdiaginvert1 == 3) {
                System.out.println("Player 1 wins");
                print(arr);
                System.exit(0);
            }
        }
    }
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}