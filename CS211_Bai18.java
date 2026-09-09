import java.util.Scanner;

public class CS211_Bai18 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        String s = kb.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        kb.close();
    }
}