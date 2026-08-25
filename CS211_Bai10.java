import java.util.Scanner;
public class CS211_Bai10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = kb.nextInt();
        switch(n) {
            case 1: System.out.println("Nhap ban kinh hinh tron: ");
                    double r = kb.nextDouble();
                    System.out.println("Dien tich hinh tron: " + (Math.PI * r * r));
                    break;
            case 2: System.out.println("Nhap chieu dai va chieu rong hinh chu nhat: ");
                    double length = kb.nextDouble();
                    double width = kb.nextDouble();
                    System.out.println("Dien tich hinh chu nhat: " + (length * width));
                    break;
            case 3: System.out.println("Nhap do dai 3 canh tam giac: ");
                    double a = kb.nextDouble();
                    double b = kb.nextDouble();
                    double c = kb.nextDouble();
                    if (a + b > c && a + c > b && b + c > a) {
                        double p = (a + b + c) / 2;
                        System.out.println("Ba canh da nhap co the tao thanh tam giac!");
                        System.out.println("Chu vi tam giac: " + (a + b + c));
                        System.out.println("Dien tich tam giac: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                    } else {
                        System.out.println("Ba canh da nhap khong tao thanh tam giac!");
                    }
        }
    }
}