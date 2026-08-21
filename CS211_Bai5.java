import java.util.Scanner;

public class CS211_Bai5 {
    public static void main(String[] args) {
        double a, b;
        System.out.println("\nGiai phuong trinh ax + b = 0");
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = kb.nextDouble();
        System.out.print("Nhap b: ");
        b = kb.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh co nghiem duy nhat: x = " + (-b / a));
        }
    }
}