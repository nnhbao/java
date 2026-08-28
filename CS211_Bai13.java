import java.util.Scanner;

public class CS211_Bai13 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap M va N: ");
        int M = kb.nextInt();
        int N = kb.nextInt();
        int K = 0;
        if (M + N >= 0 && M + N <= 100) {
                K = (M + N)*1700;
        } else if (M + N <= 150) {
                K =100*1700 + (M + N - 100)*1900;
        } else if (M + N <= 200) {
                K =100*1700 + 50*1900 + (M + N - 150)*2100;
        } else {
                K =100*1700 + 50*1900 + 50*2100 + (M + N - 200)*2500;
                
        }
        System.out.println("So tien phai tra la = " + K +"VND");
        kb.close();
    }
}