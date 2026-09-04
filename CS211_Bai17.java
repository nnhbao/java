import java.util.Scanner;
import java.util.Random;

public class CS211_Bai17 {
    public static void main(String[] args) {
        int[] a;
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Nhap so phan tu cua mang: ");
        int n = kb.nextInt();
        a = new int[n];
        for (int i = 0; i<n ; i++) {
            a[i] = rand.nextInt(0, 1000+1);
        }
        System.out.print("Cac phan tu cua mang la: ");
        int d = 0;
        int max = a[0];
        for (int i:a) {
            if (!(i % 2 ==0)) {
                d++;
            }
            if (i > max) {
                max = i;
            }
            System.out.print(i + " ");
        }
        System.out.println("\nSo phan tu le trong mang la: " + d);
        System.out.println("Phan tu lon nhat trong mang la: " + max);
        kb.close();
    } 
}