import java.util.Scanner;


public class CS211_Bai8 {

    public static void main(String[] args) {
        int d,m, y, nd, nm, ny, maxday=30;
        Scanner kb= new Scanner(System.in);
        System.out.println("nhap ngay thang nam hien tai:");
        System.out.print("Nhap ngay: ");    d= kb.nextInt();
        System.out.print("Nhap thang: ");    m= kb.nextInt();
        System.out.print("Nhap nam: ");    y= kb.nextInt();
        if (y<=0|| m<1||m>12 ) System.out.print("THANG, NAM KHONG HOP LE");
        else{
            if (m==1 || m==3||m==5||m==7||m==8||m==10||m==12) maxday=31;
            else 
               if (m==2)
                   if(y%400==0||(y%100!=0 && y%4==0))maxday=29;
                   else maxday=28;
            if (d<1|| d>maxday) System.out.println("Ngay ko hop le");
            else
            {
                nd= d+1;
                if (nd>maxday) { 
                    nd=1;
                    nm= m+1;
                    if (nm>12){ nm= 1; ny= y+1; } else ny=y;
                }
                else {nm= m; ny=y;}
                System.out.println("Ngay mai la ngay "+ nd + " thang "+ nm + " nam " + ny);
            }
        }
        System.out.println("\n XONG!");
    }
}