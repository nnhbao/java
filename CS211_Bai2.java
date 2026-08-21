import java.util.Scanner;

public class CS211_Bai2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String ten = kb.nextLine();
        System.out.println("Xin chao ban " + ten);
        System.out.println("\nXONG!");
        System.out.print("Nhap nam sinh: ");
        int namsinh = kb.nextInt();
        System.out.println("Tuoi cua ban la: " + (2026 - namsinh));
    }
}