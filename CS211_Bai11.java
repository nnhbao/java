import java.util.Scanner;

public class CS211_Bai11 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = kb.nextInt();
        System.out.print("Nhap b: ");
        int b = kb.nextInt();
        System.out.print("Nhap operator: ");
        String op = kb.next();
        switch(op) {
            case "+": System.out.print(a + " + " + b + " = " + (a + b));
                    break;
            case "-": System.out.print(a + " - " + b + " = " + (a - b));
                    break;
            case "*": System.out.print(a + " * " + b + " = " + (a * b));
                    break;
            case "/": System.out.print(a + " / " + b + " = " + ((double) a / b));
                    break;
            default: System.out.print("Phep toan khong hop le!");
        }
        kb.close();
    }
}