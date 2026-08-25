import java.util.Scanner;
public class CS211_Bai9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = kb.nextInt();
        switch (n) {
            case 5: System.out.println("Five\n");
            case 4: System.out.println("Four\n");
            case 3: System.out.println("Three\n");
            case 2: System.out.println("Two\n");
            case 1: System.out.println("One\n");
            default: System.out.println("No\n");
        }
    kb.close();
    }
}