import java.util.Scanner;
public class CS211_Bai1 {
    public static void main(String[] args) {
        int a=10, b=12;
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        a = kb.nextInt();
        System.out.print("Nhap so b: ");
        b = kb.nextInt();
        System.out.println("Tong hai so a + b = "+(a+b));
        System.out.println("Tong hai so "+a+" + "+b+" = "+(a+b));
        System.out.println("\n Xong!");
    }
}