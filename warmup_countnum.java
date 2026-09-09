import java.util.*;

public class warmup_countnum {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[100];
        int[] count = new int[10];
        System.out.print("Cac so trong danh sach: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(0,10);
            
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int x : arr) {
            count[x]++;
            
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println((i) + ": " + count[i]);
        }
    }
}