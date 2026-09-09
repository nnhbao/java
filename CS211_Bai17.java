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

        //System.out.print("Mang sau khi sap xep: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == 1000) {
                    count++;
        
                }
            }
        }
        System.out.println("\nSo cap phan tu co tong bang 1000 la: " + count);
        kb.close();
    } 
}