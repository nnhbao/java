import java.util.Scanner;

public class CS211_Bai15 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so n: ");
            n = kb.nextInt();
        } while (!(n < 0));
        
        kb.close();
    }
}