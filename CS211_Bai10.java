import java.util.Scanner;
public class CS211_Bai10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = kb.nextDouble();
        System.out.print("Nhap b: ");
        double b = kb.nextDouble();
        System.out.print("Nhap operator: ");
        String op = kb.nextLine();
        int operator = 0;
        if (op == "+") {
            operator = 1;
        } else if (op == "-") {
            operator = 2;
        } else if (op == "*") {
            operator = 3;
        } else if (op == "/") {
            operator = 4;
        } else {
            System.out.println("Khong hop le!");
        }
        switch(operator) {
            case 1: System.out.println("a + b = " + (a + b));
                    break;
            case 2: System.out.println("a - b = " + (a - b));
                    break;
            case 3: System.out.println("a * b = " + (a * b));
                    break;
            default: System.out.println("a / b = " + (a / b));
        kb.close();
        }
    }
}