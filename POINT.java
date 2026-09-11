import java.util.*;

public class POINT {
    Scanner kb = new Scanner(System.in);
    int x = 0, y = 0;
    void toado() {
        System.out.print("Nhap toa do x: ");
        x = kb.nextInt();
        System.out.print("Nhap toa do y: ");
        y = kb.nextInt();
    }
    static void dientich(POINT A, POINT B, POINT C) {
        double AB = Math.sqrt(Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2));
        double AC = Math.sqrt(Math.pow(C.x - A.x, 2) + Math.pow(C.y - A.y, 2));
        double BC = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(C.y - B.y, 2));
        if (AB + AC <= BC || AB + BC <= AC || AC + BC <= AB) {
            System.out.println("Khong phai la tam giac");
            return;
        }
        double p = (AB + AC + BC) / 2;
        double S = Math.sqrt(p * (p - AB) * (p - AC) * (p - BC));
        System.out.println("Dien tich tam giac la: " + S);
    }
    public static void main(String[] args) {
        POINT A = new POINT();
        POINT B = new POINT();
        POINT C = new POINT();
        System.out.println("Nhap toa do diem A: ");
        A.toado();
        System.out.println("Nhap toa do diem B: ");
        B.toado();
        System.out.println("Nhap toa do diem C: ");
        C.toado();
        dientich(A, B, C);
    }
}
