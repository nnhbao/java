import java.util.Scanner;

public class CS211_Bai14 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap so lan in ra: ");
        int n = kb.nextInt();
        int k = 0;
        for (int i = 1; i <= n; i++) {
                System.out.println(k =  k + i);
        }
        kb.close();
    }
}