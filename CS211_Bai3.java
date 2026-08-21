import java.util.Scanner;

public class CS211_Bai3 {
    public static void main(String[] args) {
        final float PI=3.14F;
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        float bk = kb.nextFloat();
        System.out.print("Nhap chieu cao: ");
        float cc= kb.nextFloat();
        System.out.println("Chu vi hinh tron la: "+(PI*bk*2));
        System.out.println("Dien tich hinh tron la: "+(PI*bk*bk));
        System.out.println("The tich hinh tru la: "+(PI*bk*bk*cc));
    }
}