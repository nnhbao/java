import java.util.Scanner;
import java.util.Random;

public class CS211_Bai16 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Nhap n so: ");
        int n = kb.nextInt();
        int a = 0, b = 0;
        do {
            System.out.print("Nhap so a: ");
            a = kb.nextInt();
            System.out.print("Nhap so b: ");
            b = kb.nextInt();
        } while (a >= b);
        for (int i = 0; i < n; i++) {
            int randomNumber;
            do {
                randomNumber = rand.nextInt(a, b + 1);
            } while (randomNumber % 2 != 0);
            System.out.println("So ngau nhien lan " + (i+1) + " la: " + randomNumber);
        }
        kb.close();
    }
}