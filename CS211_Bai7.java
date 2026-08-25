import java.util.Scanner;

public class CS211_Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a1, b1, c1: ");
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();

        System.out.print("Nhập a2, b2, c2: ");
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double D  = a1 * b2 - a2 * b1;
        double Dx = -c1 * b2 + c2 * b1;
        double Dy = -a1 * c2 + a2 * c1;
        if (D != 0) {
            double x = Dx / D;
            double y = Dy / D;
            System.out.println("Hệ có nghiệm duy nhất:");
            System.out.println("x = " + x + ", y = " + y);
        } else {
            if (Dx == 0 && Dy == 0) {
                System.out.println("Hệ có vô số nghiệm.");
            } else {
                System.out.println("Hệ vô nghiệm.");
            }
        }
    }
}
