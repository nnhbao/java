import java.util.Scanner;

public class CS211_Bai6 {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("\nGiai phuong trinh ax + b = 0");
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = kb.nextDouble();
        System.out.print("Nhap b: ");
        b = kb.nextDouble();
        System.out.print("Nhap c: ");
        c = kb.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Phuong trinh co nghiem duy nhat: x = " + (-b / (2 * a)));
        }
    }
}